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

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Imports ISO/IEC 27001:2022 Annex A or ISO/IEC 27002:2022 controls from a PDF
 * into an instance of TraceSec's {@code requirements.ecore}.
 * <p>
 * A standard is represented by a root {@code RequirementsSet}, its control
 * groups by nested {@code RequirementsSet}s, and individual controls by
 * {@code Requirement}s. The parser deliberately recognizes structural control
 * headings and the ISO/IEC 27002 information-security-property attribute only.
 * It does not ship or reconstruct standard text; callers must provide a
 * legitimately obtained PDF.
 */
public final class Iso2700xPdfImporter {

    public enum StandardKind {
        ISO_IEC_27001_2022("ISO/IEC 27001:2022", "ISO/IEC 27001:2022", true),
        ISO_IEC_27002_2022("ISO/IEC 27002:2022", "ISO/IEC 27002:2022", false);

        private final String identifier;
        private final String title;
        private final boolean annexPrefixRequired;

        StandardKind(final String identifier, final String title, final boolean annexPrefixRequired) {
            this.identifier = identifier;
            this.title = title;
            this.annexPrefixRequired = annexPrefixRequired;
        }
    }

    public record ParsedControl(String identifier, String title, String text, Set<String> securityProperties) {
        public ParsedControl {
            securityProperties = securityProperties == null ? Set.of() : Set.copyOf(securityProperties);
        }
    }

    public record ImportResult(ResourceSet resourceSet, EPackage metamodel, Resource model, EObject standard,
            List<EObject> controls) {
        public ImportResult {
            controls = List.copyOf(controls);
        }
    }

    private static final Pattern ISO_27001_CONTROL = Pattern.compile("^A\\.(5|6|7|8)\\.(\\d+)\\s+(.+)$");
    private static final Pattern ISO_27002_CONTROL = Pattern.compile("^(5|6|7|8)\\.(\\d+)\\s+(.+)$");
    private static final Pattern HASH_PROPERTY = Pattern.compile("#\\s*([^#\\r\\n,;]+)");
    private static final List<String> ATTRIBUTE_BOUNDARIES = List.of("control type", "cybersecurity concepts",
            "operational capabilities", "security domains", "guidance", "purpose");
    private static final List<String> FALLBACK_PROPERTIES = List.of("Confidentiality", "Integrity", "Availability",
            "Authenticity", "Accountability", "Non-repudiation", "Resistance", "Reliability", "Recoverability",
            "Fault tolerance");

    private Iso2700xPdfImporter() {
    }

    public static ImportResult importPdf(final Path pdf, final Path requirementsEcore, final Path outputXmi,
            final StandardKind kind) throws IOException {
        final String text;
        try (PDDocument document = Loader.loadPDF(pdf.toFile())) {
            text = new PDFTextStripper().getText(document);
        }
        return importText(text, requirementsEcore, outputXmi, kind);
    }

    /** Entry point intended for deterministic parser tests without a PDF fixture. */
    public static ImportResult importText(final String text, final Path requirementsEcore, final Path outputXmi,
            final StandardKind kind) throws IOException {
        final List<ParsedControl> parsed = parseControls(text, kind);
        if (parsed.isEmpty()) {
            throw new IllegalArgumentException("No " + kind.identifier + " controls found in supplied text");
        }

        final ResourceSet set = new ResourceSetImpl();
        final EPackage requirements = DynamicModelSupport.loadPackage(set, requirementsEcore);
        final Resource model = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject standard = DynamicModelSupport.create(requirements, "RequirementsSet");
        DynamicModelSupport.set(standard, "id", kind.identifier);
        DynamicModelSupport.set(standard, "title", kind.title);
        DynamicModelSupport.set(standard, "wording", "");
        model.getContents().add(standard);

        final Map<String, EObject> groups = new LinkedHashMap<>();
        final List<EObject> controls = new ArrayList<>();
        for (final ParsedControl parsedControl : parsed) {
            final String groupId = controlGroup(parsedControl.identifier());
            final EObject group = groups.computeIfAbsent(groupId, id -> {
                final EObject created = DynamicModelSupport.create(requirements, "RequirementsSet");
                DynamicModelSupport.set(created, "id", id);
                DynamicModelSupport.set(created, "title", "Control group " + id);
                DynamicModelSupport.set(created, "wording", "");
                DynamicModelSupport.add(standard, "requirements", created);
                return created;
            });

            final EObject control = DynamicModelSupport.create(requirements, "Requirement");
            DynamicModelSupport.set(control, "id", parsedControl.identifier());
            DynamicModelSupport.set(control, "title", parsedControl.title());
            DynamicModelSupport.set(control, "wording", parsedControl.text());
            DynamicModelSupport.add(group, "requirements", control);
            controls.add(control);
        }
        model.save(Map.of());
        return new ImportResult(set, requirements, model, standard, controls);
    }

    public static List<ParsedControl> parseControls(final String text, final StandardKind kind) {
        if (text == null || text.isBlank()) {
            return List.of();
        }
        final Pattern heading = kind.annexPrefixRequired ? ISO_27001_CONTROL : ISO_27002_CONTROL;
        final List<ParsedControl> controls = new ArrayList<>();
        String currentIdentifier = null;
        String currentTitle = null;
        final StringBuilder body = new StringBuilder();

        for (final String rawLine : text.replace('\r', '\n').split("\\n")) {
            final String line = rawLine.trim().replaceAll("\\s+", " ");
            if (line.isBlank()) {
                continue;
            }
            final Matcher matcher = heading.matcher(line);
            if (matcher.matches()) {
                if (currentIdentifier != null) {
                    controls.add(control(currentIdentifier, currentTitle, body.toString()));
                }
                currentIdentifier = kind.annexPrefixRequired ? "A." + matcher.group(1) + "." + matcher.group(2)
                        : matcher.group(1) + "." + matcher.group(2);
                currentTitle = matcher.group(3).trim();
                body.setLength(0);
            } else if (currentIdentifier != null) {
                if (body.length() > 0) {
                    body.append('\n');
                }
                body.append(line);
            }
        }
        if (currentIdentifier != null) {
            controls.add(control(currentIdentifier, currentTitle, body.toString()));
        }
        return controls;
    }

    private static String controlGroup(final String identifier) {
        final String[] parts = identifier.split("\\.");
        if (identifier.startsWith("A.") && parts.length >= 2) {
            return "A." + parts[1];
        }
        return parts.length == 0 ? identifier : parts[0];
    }

    private static ParsedControl control(final String identifier, final String title, final String text) {
        return new ParsedControl(identifier, title, text.strip(), extractSecurityProperties(text));
    }

    /**
     * Extracts every value from the ISO/IEC 27002 "Information security
     * properties" attribute. The standard renders these values as hashtag labels;
     * parsing them generically keeps the importer open to the complete ISO/IEC
     * 25010-derived property vocabulary instead of hard-coding CIA.
     */
    static Set<String> extractSecurityProperties(final String controlText) {
        if (controlText == null || controlText.isBlank()) {
            return Set.of();
        }
        final String lower = controlText.toLowerCase(Locale.ROOT);
        final String marker = "information security properties";
        final int markerIndex = lower.indexOf(marker);
        if (markerIndex < 0) {
            return Set.of();
        }
        final int valuesStart = markerIndex + marker.length();
        int end = Math.min(controlText.length(), valuesStart + 500);
        for (final String boundary : ATTRIBUTE_BOUNDARIES) {
            final int candidate = lower.indexOf(boundary, valuesStart);
            if (candidate >= 0) {
                end = Math.min(end, candidate);
            }
        }

        final String attributes = controlText.substring(valuesStart, end);
        final Set<String> result = new LinkedHashSet<>();
        final Matcher hashtags = HASH_PROPERTY.matcher(attributes);
        while (hashtags.find()) {
            final String property = canonicalSecurityProperty(hashtags.group(1));
            if (!property.isBlank()) {
                result.add(property);
            }
        }

        // Some PDF extractors drop the '#' glyph. Retain a conservative fallback for
        // the established ISO/IEC 25010-derived labels while preferring the generic
        // hashtag extraction above.
        if (result.isEmpty()) {
            final String normalizedAttributes = FeatureMappingCatalog.normalize(attributes);
            for (final String property : FALLBACK_PROPERTIES) {
                if (normalizedAttributes.contains(FeatureMappingCatalog.normalize(property))) {
                    result.add(property);
                }
            }
        }
        return result;
    }

    private static String canonicalSecurityProperty(final String raw) {
        if (raw == null) {
            return "";
        }
        String value = raw.trim().replace('_', ' ').replace('–', '-').replace('—', '-').replaceAll("\\s+", " ");
        value = value.replaceAll("^[\\-:]+|[\\-:]+$", "").trim();
        if (value.isBlank()) {
            return "";
        }
        final String normalized = value.toLowerCase(Locale.ROOT);
        if (normalized.equals("non repudiation") || normalized.equals("non-repudiation")) {
            return "Non-repudiation";
        }
        return Character.toUpperCase(normalized.charAt(0)) + normalized.substring(1);
    }
}
