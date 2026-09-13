package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/** Test-only fixture for the one-time ISO generator. Not part of the production bundle. */
public final class Iso2700xPdfImporter {
    public enum StandardKind {
        ISO_IEC_27001_2022("ISO/IEC 27001:2022", true),
        ISO_IEC_27002_2022("ISO/IEC 27002:2022", false);
        final String id; final boolean annex;
        StandardKind(final String id, final boolean annex) { this.id = id; this.annex = annex; }
    }

    public record ParsedControl(String identifier, String title, String text, Set<String> securityProperties) {}

    public static final class ImportResult extends StandardRequirementsModel {
        ImportResult(final String identifier, final Resource model, final EObject standard, final List<EObject> controls,
                final Map<EObject, Set<String>> properties) {
            super(identifier, model, standard, controls, properties);
        }
    }

    private static final Pattern P27001 = Pattern.compile("^A\\.(5|6|7|8)\\.(\\d+)\\s+(.+)$");
    private static final Pattern P27002 = Pattern.compile("^(5|6|7|8)\\.(\\d+)\\s+(.+)$");
    private static final Pattern HASH = Pattern.compile("#\\s*([^#\\r\\n,;]+)");
    private static final List<String> PROPS = List.of("Confidentiality", "Integrity", "Non-repudiation", "Accountability",
            "Authenticity", "Resistance", "Availability");

    private Iso2700xPdfImporter() {}

    public static List<ParsedControl> parseControls(final String text, final StandardKind kind) {
        final Pattern heading = kind.annex ? P27001 : P27002;
        final List<ParsedControl> result = new ArrayList<>();
        String id = null, title = null; final StringBuilder body = new StringBuilder();
        for (final String raw : text.replace('\r', '\n').split("\\n")) {
            final String line = raw.trim().replaceAll("\\s+", " ");
            if (line.isBlank()) continue;
            final Matcher m = heading.matcher(line);
            if (m.matches()) {
                if (id != null) result.add(control(id, title, body.toString()));
                id = kind.annex ? "A." + m.group(1) + "." + m.group(2) : m.group(1) + "." + m.group(2);
                title = m.group(3).trim(); body.setLength(0);
            } else if (id != null) {
                if (body.length() > 0) body.append('\n');
                body.append(line);
            }
        }
        if (id != null) result.add(control(id, title, body.toString()));
        return result;
    }

    public static ImportResult importText(final ResourceSet set, final String text, final Path requirementsEcore,
            final Path outputXmi, final StandardKind kind) throws IOException {
        final ResourceSet effective = set == null ? new ResourceSetImpl() : set;
        effective.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("ecore", new EcoreResourceFactoryImpl());
        effective.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());
        final Resource meta = effective.getResource(URI.createFileURI(requirementsEcore.toAbsolutePath().toString()), true);
        final EPackage pkg = (EPackage) meta.getContents().get(0);
        effective.getPackageRegistry().put(pkg.getNsURI(), pkg);
        final Resource model = effective.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject standard = create(pkg, "RequirementsSet");
        set(standard, "id", kind.id); set(standard, "title", kind.id); set(standard, "wording", "");
        model.getContents().add(standard);
        final Map<String,EObject> groups = new LinkedHashMap<>();
        final List<EObject> controls = new ArrayList<>(); final Map<EObject,Set<String>> props = new LinkedHashMap<>();
        for (final ParsedControl parsed : parseControls(text, kind)) {
            final String groupId = parsed.identifier().startsWith("A.") ? String.join(".", parsed.identifier().split("\\.")[0], parsed.identifier().split("\\.")[1]) : parsed.identifier().split("\\.")[0];
            final EObject group = groups.computeIfAbsent(groupId, ignored -> {
                final EObject g = create(pkg,"RequirementsSet"); set(g,"id",groupId); set(g,"title","Control group " + groupId); set(g,"wording",""); add(standard,"requirements",g); return g;
            });
            final EObject requirement = create(pkg,"Requirement"); set(requirement,"id",parsed.identifier()); set(requirement,"title",parsed.title()); set(requirement,"wording",parsed.text()); add(group,"requirements",requirement);
            controls.add(requirement); props.put(requirement, parsed.securityProperties());
        }
        model.save(Map.of());
        return new ImportResult(kind.id, model, standard, controls, props);
    }

    public static ImportResult importText(final String text, final Path requirementsEcore, final Path outputXmi,
            final StandardKind kind) throws IOException { return importText(new ResourceSetImpl(), text, requirementsEcore, outputXmi, kind); }

    private static ParsedControl control(final String id, final String title, final String body) {
        return new ParsedControl(id, title, body.strip(), extract(body));
    }
    private static Set<String> extract(final String text) {
        final String lower = text.toLowerCase(Locale.ROOT); final int start = lower.indexOf("information security properties");
        if (start < 0) return Set.of();
        int end = text.length();
        for (final String b : List.of("control type","cybersecurity concepts","operational capabilities","security domains","guidance","purpose")) {
            final int p = lower.indexOf(b, start + 1); if (p >= 0) end = Math.min(end,p);
        }
        final String block = text.substring(start, end); final Set<String> result = new LinkedHashSet<>();
        final Matcher matcher = HASH.matcher(block);
        while (matcher.find()) { final String v = canonical(matcher.group(1)); if (!v.isBlank()) result.add(v); }
        if (result.isEmpty()) for (final String p : PROPS) if (normalize(block).contains(normalize(p))) result.add(p);
        return result;
    }
    private static String canonical(final String raw) {
        String v = raw.trim().replace('_',' ').replace('–','-').replace('—','-').replaceAll("\\s+"," ").replaceAll("^[\\-:]+|[\\-:]+$","").trim();
        if (v.equalsIgnoreCase("non repudiation") || v.equalsIgnoreCase("non-repudiation")) return "Non-repudiation";
        return v.isBlank() ? "" : Character.toUpperCase(v.charAt(0)) + v.substring(1).toLowerCase(Locale.ROOT);
    }
    private static String normalize(final String s) { return s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+",""); }
    private static EObject create(final EPackage pkg, final String name) { return pkg.getEFactoryInstance().create((EClass) pkg.getEClassifier(name)); }
    private static void set(final EObject o, final String f, final Object v) { o.eSet(o.eClass().getEStructuralFeature(f), v); }
    @SuppressWarnings("unchecked") private static void add(final EObject o, final String f, final Object v) { ((List<Object>) o.eGet(o.eClass().getEStructuralFeature(f))).add(v); }
}
