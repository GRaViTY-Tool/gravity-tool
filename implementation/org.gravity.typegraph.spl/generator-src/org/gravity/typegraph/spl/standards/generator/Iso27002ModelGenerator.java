package org.gravity.typegraph.spl.standards.generator;

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

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * One-time generator for reusable ISO/IEC 27002 TraceSec artifacts.
 * <p>
 * This source tree is deliberately excluded from the Eclipse bundle. Run it only
 * when the standard artifact must be (re)generated from a legitimately obtained
 * ISO/IEC 27002:2022 PDF. Normal GRaViTY analysis loads the resulting XMI files.
 */
public final class Iso27002ModelGenerator {

    private static final Pattern CONTROL = Pattern.compile("^(5|6|7|8)\\.(\\d+)\\s+(.+)$");
    private static final Pattern HASH_PROPERTY = Pattern.compile("#\\s*([^#\\r\\n,;]+)");
    private static final List<String> BOUNDARIES = List.of("control type", "cybersecurity concepts",
            "operational capabilities", "security domains", "guidance", "purpose");
    private static final List<String> FALLBACK = List.of("Confidentiality", "Integrity", "Non-repudiation",
            "Accountability", "Authenticity", "Resistance", "Availability");

    private record ParsedControl(String id, String title, String wording, Set<String> properties) {}

    private Iso27002ModelGenerator() {}

    public static void generate(final Path pdf, final Path requirementsEcore, final Path propertiesEcore,
            final Path requirementsXmi, final Path propertiesXmi) throws IOException {
        final String text;
        try (PDDocument document = Loader.loadPDF(pdf.toFile())) {
            text = new PDFTextStripper().getText(document);
        }
        generateFromText(text, requirementsEcore, propertiesEcore, requirementsXmi, propertiesXmi);
    }

    static void generateFromText(final String text, final Path requirementsEcore, final Path propertiesEcore,
            final Path requirementsXmi, final Path propertiesXmi) throws IOException {
        final List<ParsedControl> controls = parse(text);
        if (controls.isEmpty()) {
            throw new IllegalArgumentException("No ISO/IEC 27002:2022 controls found");
        }
        final ResourceSetImpl set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        final EPackage req = loadPackage(set, requirementsEcore);
        final EPackage props = loadPackage(set, propertiesEcore);

        final Resource requirements = set.createResource(URI.createFileURI(requirementsXmi.toAbsolutePath().toString()));
        final EObject standard = create(req, "RequirementsSet");
        set(standard, "id", "ISO/IEC 27002:2022");
        set(standard, "title", "ISO/IEC 27002:2022");
        set(standard, "wording", "");
        requirements.getContents().add(standard);
        final Map<String, EObject> groups = new LinkedHashMap<>();
        for (final ParsedControl parsed : controls) {
            final String groupId = parsed.id().substring(0, parsed.id().indexOf('.'));
            final EObject group = groups.computeIfAbsent(groupId, ignored -> {
                final EObject value = create(req, "RequirementsSet");
                set(value, "id", groupId); set(value, "title", "Control group " + groupId); set(value, "wording", "");
                add(standard, "requirements", value); return value;
            });
            final EObject requirement = create(req, "Requirement");
            set(requirement, "id", parsed.id()); set(requirement, "title", parsed.title()); set(requirement, "wording", parsed.wording());
            add(group, "requirements", requirement);
        }
        requirements.save(Map.of());

        final Resource propertyResource = set.createResource(URI.createFileURI(propertiesXmi.toAbsolutePath().toString()));
        final EObject index = create(props, "SecurityPropertyIndex");
        propertyResource.getContents().add(index);
        for (final ParsedControl parsed : controls) {
            final EObject entry = create(props, "SecurityPropertyEntry");
            set(entry, "requirementId", parsed.id());
            parsed.properties().forEach(property -> add(entry, "properties", property));
            add(index, "entries", entry);
        }
        propertyResource.save(Map.of());
    }

    private static List<ParsedControl> parse(final String text) {
        final List<ParsedControl> result = new ArrayList<>();
        String id = null, title = null; final StringBuilder body = new StringBuilder();
        for (final String raw : text.replace('\r', '\n').split("\\n")) {
            final String line = raw.trim().replaceAll("\\s+", " ");
            if (line.isBlank()) continue;
            final Matcher matcher = CONTROL.matcher(line);
            if (matcher.matches()) {
                if (id != null) result.add(new ParsedControl(id, title, body.toString().strip(), properties(body.toString())));
                id = matcher.group(1) + "." + matcher.group(2); title = matcher.group(3).trim(); body.setLength(0);
            } else if (id != null) {
                if (body.length() > 0) body.append('\n'); body.append(line);
            }
        }
        if (id != null) result.add(new ParsedControl(id, title, body.toString().strip(), properties(body.toString())));
        return result;
    }

    private static Set<String> properties(final String text) {
        final String lower = text.toLowerCase(Locale.ROOT); final String marker = "information security properties";
        final int markerIndex = lower.indexOf(marker); if (markerIndex < 0) return Set.of();
        final int start = markerIndex + marker.length(); int end = Math.min(text.length(), start + 500);
        for (final String boundary : BOUNDARIES) { final int p = lower.indexOf(boundary, start); if (p >= 0) end = Math.min(end, p); }
        final String block = text.substring(start, end); final Set<String> result = new LinkedHashSet<>();
        final Matcher matcher = HASH_PROPERTY.matcher(block);
        while (matcher.find()) { final String p = canonical(matcher.group(1)); if (!p.isBlank()) result.add(p); }
        if (result.isEmpty()) { final String normalized = normalize(block); for (final String p : FALLBACK) if (normalized.contains(normalize(p))) result.add(p); }
        return result;
    }

    private static String canonical(final String raw) {
        String value = raw.trim().replace('_', ' ').replace('–', '-').replace('—', '-').replaceAll("\\s+", " ");
        value = value.replaceAll("^[\\-:]+|[\\-:]+$", "").trim();
        if (value.equalsIgnoreCase("non repudiation") || value.equalsIgnoreCase("non-repudiation")) return "Non-repudiation";
        return value.isBlank() ? "" : Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase(Locale.ROOT);
    }

    private static String normalize(final String value) { return value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", ""); }
    private static EPackage loadPackage(final ResourceSetImpl set, final Path path) { final EPackage p = (EPackage) set.getResource(URI.createFileURI(path.toAbsolutePath().toString()), true).getContents().get(0); set.getPackageRegistry().put(p.getNsURI(), p); return p; }
    private static EObject create(final EPackage p, final String name) { return p.getEFactoryInstance().create((EClass) p.getEClassifier(name)); }
    private static void set(final EObject o, final String f, final Object v) { o.eSet(o.eClass().getEStructuralFeature(f), v); }
    @SuppressWarnings("unchecked") private static void add(final EObject o, final String f, final Object v) { ((List<Object>) o.eGet(o.eClass().getEStructuralFeature(f))).add(v); }
}
