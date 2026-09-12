package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.spl.SplPackage;

/**
 * Executes TraceSec on previously serialized artifacts.
 * <p>
 * Artifact construction is intentionally not performed here. The executor
 * initializes the TraceSec runtime, reloads requirements, program, quality and
 * correspondence XMI using TraceSec's generated packages, constructs the flow
 * graph and invokes TraceSec prioritization. Reflection keeps the GRaViTY SPL
 * construction bundle free of a mandatory compile-time dependency on TraceSec;
 * the TraceSec bundles must be installed when this class is executed.
 */
public final class TraceSecExecutor {

    public record Request(Path configuration, List<String> modelOrderNsUris, List<Path> modelXmis,
            Path correspondenceXmi, Path qualityModelXmi, Path flowGraphXmi) {
        public Request {
            if (configuration == null || correspondenceXmi == null || qualityModelXmi == null) {
                throw new IllegalArgumentException("configuration, correspondenceXmi, and qualityModelXmi are required");
            }
            modelOrderNsUris = modelOrderNsUris == null ? List.of() : List.copyOf(modelOrderNsUris);
            modelXmis = modelXmis == null ? List.of() : List.copyOf(modelXmis);
        }
    }

    public record ExecutionResult(ResourceSet resourceSet, EObject graph,
            SortedMap<Integer, List<EObject>> prioritizedFindings) {
        public ExecutionResult {
            final SortedMap<Integer, List<EObject>> copy = new TreeMap<>();
            if (prioritizedFindings != null) {
                prioritizedFindings.forEach((priority, findings) -> copy.put(priority,
                        findings == null ? List.of() : List.copyOf(findings)));
            }
            prioritizedFindings = java.util.Collections.unmodifiableSortedMap(copy);
        }
    }

    private static final String PRIORITIZATION_BUNDLE = "org.tracesec.prioritization";

    public ExecutionResult execute(final Request request) throws IOException {
        if (request == null) {
            throw new IllegalArgumentException("request must not be null");
        }
        try {
            initializeGraphConfigurationDsl();
            final ResourceSet set = createRuntimeResourceSet();
            final EObject configuration = loadRoot(set, request.configuration());
            final List<EPackage> order = resolveOrder(set, request.modelOrderNsUris());

            final List<Resource> modelResources = new ArrayList<>();
            for (final Path model : request.modelXmis()) {
                modelResources.add(load(set, model));
            }
            final Resource correspondence = load(set, request.correspondenceXmi());
            final Resource qualityResource = load(set, request.qualityModelXmi());
            EcoreUtil.resolveAll(set);

            final EObject qualityModel = findRootByClassName(qualityResource, "QualityModel");
            if (qualityModel == null) {
                throw new IllegalArgumentException("No QualityModel root in " + request.qualityModelXmi());
            }
            final EObject qualityRoot = reference(qualityModel, "root");
            if (qualityRoot == null) {
                throw new IllegalArgumentException("QualityModel has no root quality");
            }

            final Object builder = newGraphBuilder(configuration, order);
            for (final Resource resource : modelResources) {
                for (final EObject root : resource.getContents()) {
                    addToGraph(builder, root);
                }
            }
            for (final EObject root : correspondence.getContents()) {
                addToGraph(builder, root);
            }

            final List<EObject> findings = findObjectsByClassName(modelResources, "SonarlintFinding");
            linkFindings(qualityModel, findings);
            addToGraph(builder, qualityRoot);
            final EObject graph = (EObject) builder.getClass().getMethod("getGraph").invoke(builder);

            if (request.flowGraphXmi() != null) {
                final Resource flowGraph = set.createResource(URI.createFileURI(request.flowGraphXmi().toAbsolutePath().toString()));
                flowGraph.getContents().add(graph);
                flowGraph.save(Map.of());
            }

            final SortedMap<Integer, List<EObject>> prioritization = prioritize(findings, qualityRoot, graph);
            return new ExecutionResult(set, graph, prioritization);
        } catch (final InvocationTargetException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof IOException io) {
                throw io;
            }
            throw new IllegalStateException("TraceSec execution failed", cause == null ? e : cause);
        } catch (final ReflectiveOperationException e) {
            throw new IllegalStateException(
                    "TraceSec runtime classes are not available. Install the TraceSec prioritization, quality-model, "
                            + "requirements and graph-DSL bundles before executing TraceSec.",
                    e);
        }
    }

    private void initializeGraphConfigurationDsl() throws ReflectiveOperationException {
        final Class<?> setup = runtimeClass("org.tracesec.graph.dsl.GraphConfigurationStandaloneSetup");
        setup.getMethod("doSetup").invoke(null);
    }

    private ResourceSet createRuntimeResourceSet() throws ReflectiveOperationException {
        final ResourceSet set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
        set.getPackageRegistry().put(SplPackage.eNS_URI, SplPackage.eINSTANCE);

        registerGeneratedPackage(set, "org.tracesec.requirements.RequirementsPackage");
        registerGeneratedPackage(set, "org.tracesec.qualitymodel.QualityModelPackage");
        registerGeneratedPackage(set, "org.tracesec.prioritization.tracelinks.TracelinksPackage");
        registerGeneratedPackage(set, "org.moflon.tgg.runtime.RuntimePackage");
        registerOptionalGeneratedPackage(set, "org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage");
        return set;
    }

    private void registerGeneratedPackage(final ResourceSet set, final String className)
            throws ReflectiveOperationException {
        final Class<?> packageClass = runtimeClass(className);
        final Object instance = packageClass.getField("eINSTANCE").get(null);
        if (!(instance instanceof EPackage ePackage)) {
            throw new IllegalStateException(className + ".eINSTANCE is not an EPackage");
        }
        set.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
    }

    private void registerOptionalGeneratedPackage(final ResourceSet set, final String className) {
        try {
            registerGeneratedPackage(set, className);
        } catch (final ReflectiveOperationException | IllegalStateException ignored) {
            // SonarLint findings may be absent from a model; loading can still succeed then.
        }
    }

    private Resource load(final ResourceSet set, final Path path) {
        return set.getResource(URI.createFileURI(path.toAbsolutePath().toString()), true);
    }

    private EObject loadRoot(final ResourceSet set, final Path path) {
        final Resource resource = load(set, path);
        if (resource.getContents().isEmpty()) {
            throw new IllegalArgumentException("No model root in " + path);
        }
        return resource.getContents().get(0);
    }

    private List<EPackage> resolveOrder(final ResourceSet set, final List<String> nsUris) {
        final List<EPackage> order = new ArrayList<>();
        for (final String nsUri : nsUris) {
            final EPackage ePackage = set.getPackageRegistry().getEPackage(nsUri);
            if (ePackage == null) {
                throw new IllegalArgumentException("No runtime EPackage registered for model-order URI " + nsUri);
            }
            order.add(ePackage);
        }
        return order;
    }

    private Object newGraphBuilder(final EObject configuration, final List<EPackage> order)
            throws ReflectiveOperationException {
        final Class<?> builderClass = runtimeClass("org.tracesec.prioritization.GraphBuilder");
        for (final Constructor<?> constructor : builderClass.getConstructors()) {
            final Class<?>[] parameters = constructor.getParameterTypes();
            if (parameters.length == 2 && parameters[0].isInstance(configuration)
                    && parameters[1].isAssignableFrom(order.getClass())) {
                return constructor.newInstance(configuration, order);
            }
        }
        throw new NoSuchMethodException("No GraphBuilder(Configuration, List<EPackage>) constructor found");
    }

    private void addToGraph(final Object builder, final EObject object) throws ReflectiveOperationException {
        builder.getClass().getMethod("add", EObject.class).invoke(builder, object);
    }

    private void linkFindings(final EObject qualityModel, final Collection<EObject> findings)
            throws ReflectiveOperationException {
        final Class<?> linker = runtimeClass("org.tracesec.qualitymodel.FindingLinker");
        final Method method = compatibleMethod(linker, "linkFindings", qualityModel, findings);
        method.invoke(null, qualityModel, findings);
    }

    private SortedMap<Integer, List<EObject>> prioritize(final Collection<EObject> findings, final EObject qualityRoot,
            final EObject graph) throws ReflectiveOperationException {
        final Class<?> prioritizationClass = runtimeClass("org.tracesec.prioritization.Priorizitation");
        final Object prioritization = prioritizationClass.getConstructor().newInstance();
        final Method method = compatibleMethod(prioritizationClass, "prioritize", findings, qualityRoot, graph);
        final Object raw = method.invoke(prioritization, findings, qualityRoot, graph);
        if (!(raw instanceof Map<?, ?> result)) {
            throw new IllegalStateException("TraceSec prioritization did not return a map");
        }

        final SortedMap<Integer, List<EObject>> converted = new TreeMap<>();
        for (final Map.Entry<?, ?> entry : result.entrySet()) {
            if (!(entry.getKey() instanceof Integer priority) || !(entry.getValue() instanceof Collection<?> values)) {
                continue;
            }
            final List<EObject> objects = values.stream().filter(EObject.class::isInstance).map(EObject.class::cast).toList();
            converted.put(priority, objects);
        }
        return converted;
    }

    private Method compatibleMethod(final Class<?> owner, final String name, final Object... arguments)
            throws NoSuchMethodException {
        for (final Method method : owner.getMethods()) {
            if (!method.getName().equals(name) || method.getParameterCount() != arguments.length) {
                continue;
            }
            final Class<?>[] types = method.getParameterTypes();
            boolean compatible = true;
            for (var i = 0; i < types.length; i++) {
                if (arguments[i] != null && !types[i].isInstance(arguments[i])) {
                    compatible = false;
                    break;
                }
            }
            if (compatible && (Modifier.isStatic(method.getModifiers()) || !Modifier.isAbstract(method.getModifiers()))) {
                return method;
            }
        }
        throw new NoSuchMethodException(owner.getName() + "." + name);
    }

    private EObject findRootByClassName(final Resource resource, final String className) {
        return resource.getContents().stream().filter(object -> className.equals(object.eClass().getName())).findFirst()
                .orElse(null);
    }

    private List<EObject> findObjectsByClassName(final Collection<? extends Resource> resources,
            final String className) {
        final Map<EObject, Boolean> unique = new LinkedHashMap<>();
        for (final Resource resource : resources) {
            for (final EObject root : resource.getContents()) {
                if (className.equals(root.eClass().getName())) {
                    unique.put(root, Boolean.TRUE);
                }
                final var iterator = root.eAllContents();
                while (iterator.hasNext()) {
                    final EObject object = iterator.next();
                    if (className.equals(object.eClass().getName())) {
                        unique.put(object, Boolean.TRUE);
                    }
                }
            }
        }
        return List.copyOf(unique.keySet());
    }

    private EObject reference(final EObject object, final String featureName) {
        final var feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || feature.isMany()) {
            return null;
        }
        final Object value = object.eGet(feature, false);
        return value instanceof EObject eObject ? eObject : null;
    }

    private Class<?> runtimeClass(final String className) throws ClassNotFoundException {
        final ClassLoader[] loaders = { Thread.currentThread().getContextClassLoader(),
                TraceSecExecutor.class.getClassLoader() };
        for (final ClassLoader loader : loaders) {
            if (loader == null) {
                continue;
            }
            try {
                return Class.forName(className, true, loader);
            } catch (final ClassNotFoundException ignored) {
                // Try the Eclipse bundle registry below.
            }
        }

        for (final String bundleName : candidateBundles(className)) {
            try {
                final Class<?> platform = Class.forName("org.eclipse.core.runtime.Platform", true,
                        TraceSecExecutor.class.getClassLoader());
                final Object bundle = platform.getMethod("getBundle", String.class).invoke(null, bundleName);
                if (bundle == null) {
                    continue;
                }
                final Object loaded = bundle.getClass().getMethod("loadClass", String.class).invoke(bundle, className);
                if (loaded instanceof Class<?> type) {
                    return type;
                }
            } catch (final ReflectiveOperationException ignored) {
                // Continue with the next candidate bundle.
            }
        }
        throw new ClassNotFoundException(className);
    }

    private List<String> candidateBundles(final String className) {
        final List<String> bundles = new ArrayList<>();
        if (className.startsWith("org.tracesec.graph.dsl.")) {
            bundles.add("org.tracesec.graph.dsl");
        } else if (className.startsWith("org.tracesec.qualitymodel.")) {
            bundles.add("org.tracesec.qualitymodel");
        } else if (className.startsWith("org.tracesec.requirements.")) {
            bundles.add("org.tracesec.requirements");
        } else if (className.startsWith("org.moflon.tgg.runtime.")) {
            bundles.add("org.moflon.tgg.runtime");
        } else if (className.startsWith("org.gravity.hulk.sonarlint.")) {
            bundles.add("org.gravity.hulk.sonarlint");
        }
        bundles.add(PRIORITIZATION_BUNDLE);
        return bundles;
    }
}
