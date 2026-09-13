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

import org.gravity.typegraph.spl.standards.EmseSecurityFeatureTaxonomy;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.MappingRelation;
import org.gravity.typegraph.spl.standards.StandardControlReference;

/** Parses the EMSE replication workbook only for offline artifact generation. */
final class EmseStandardsWorkbookParser {

    static final String REPLICATION_PACKAGE_DOI = "https://doi.org/10.5281/zenodo.11091429";
    static final String WORKBOOK_NAME = "2) Systematic Review - Security Standards.xlsx";
    static final String WORKBOOK_MD5 = "61849150ceb83e38d704348d7dd7d972";

    private static final Pattern ISO_CONTROL = Pattern.compile("(?i)\\b(A\\.)?([5-8])\\.(\\d+)\\b");
    private static final Pattern NIST_CONTROL = Pattern.compile("(?i)\\b[A-Z]{2}-\\d+(?:\\s*\\(\\d+\\))?\\b");
    private static final Pattern CSF_CONTROL = Pattern.compile("(?i)\\b[A-Z]{2}\\.[A-Z]{2}-\\d+\\b");
    private static final Pattern CC_CONTROL = Pattern.compile("\\b\\d{1,2}\\.\\d+\\b");

    private record Columns(int headerRow, int implementable, int control, List<Integer> features) {
    }

    private EmseStandardsWorkbookParser() {
    }

    static FeatureMappingCatalog parse(final Path workbook) throws IOException {
        final Map<String, Set<StandardControlReference>> controlsByFeature = new LinkedHashMap<>();
        final Map<String, String> displayNameByFeature = new LinkedHashMap<>();

        for (final XlsxWorkbookReader.Sheet sheet : XlsxWorkbookReader.read(workbook)) {
            final Columns columns = detectColumns(sheet.rows());
            if (columns == null || columns.features().isEmpty()) {
                continue;
            }
            final String standard = standardName(sheet.name());
            for (int rowIndex = columns.headerRow() + 1; rowIndex < sheet.rows().size(); rowIndex++) {
                final List<String> row = sheet.rows().get(rowIndex);
                if (columns.implementable() >= 0 && !isYes(value(row, columns.implementable()))) {
                    continue;
                }
                final String control = findControl(row, columns.control(), standard);
                if (control.isBlank()) {
                    continue;
                }
                final LinkedHashSet<String> rawFeatures = new LinkedHashSet<>();
                for (final int featureColumn : columns.features()) {
                    rawFeatures.addAll(splitFeatures(value(row, featureColumn)));
                }
                for (final String rawFeature : rawFeatures) {
                    final String feature = canonicalFeature(standard, control, rawFeature);
                    final String normalized = normalize(feature);
                    if (normalized.isBlank()) {
                        continue;
                    }
                    final String source = REPLICATION_PACKAGE_DOI + " / " + WORKBOOK_NAME + " / sheet='"
                            + sheet.name() + "' / row=" + (rowIndex + 1) + " / label='" + rawFeature.trim() + "'";
                    final StandardControlReference reference = new StandardControlReference(standard, control,
                            MappingRelation.REALIZES, source, 1.0d);
                    controlsByFeature.computeIfAbsent(normalized, ignored -> new LinkedHashSet<>()).add(reference);
                    displayNameByFeature.putIfAbsent(normalized, feature);
                }
            }
        }

        if (controlsByFeature.isEmpty()) {
            throw new IllegalArgumentException("No standards-to-feature mappings found in " + workbook
                    + ". Expected the EMSE replication-package workbook '" + WORKBOOK_NAME + "'.");
        }

        final List<FeatureMappingCatalog.Entry> entries = new ArrayList<>();
        for (final var entry : controlsByFeature.entrySet()) {
            entries.add(FeatureMappingCatalog.entry(displayNameByFeature.get(entry.getKey()), Set.of(),
                    List.copyOf(entry.getValue())));
        }
        return new FeatureMappingCatalog(entries);
    }

    private static Columns detectColumns(final List<List<String>> rows) {
        final int limit = Math.min(rows.size(), 25);
        for (int rowIndex = 0; rowIndex < limit; rowIndex++) {
            final List<String> row = rows.get(rowIndex);
            int implementable = -1;
            int control = -1;
            final List<Integer> featureColumns = new ArrayList<>();
            for (int column = 0; column < row.size(); column++) {
                final String header = normalizeHeader(row.get(column));
                if (header.isBlank()) {
                    continue;
                }
                if (header.contains("related to implementation level feature")
                        || (header.contains("implementation level") && header.contains("yes no"))) {
                    implementable = column;
                } else if (isFeatureHeader(header)) {
                    featureColumns.add(column);
                } else if (control < 0 && isControlHeader(header)) {
                    control = column;
                }
            }
            if (!featureColumns.isEmpty() && (control >= 0 || implementable >= 0)) {
                return new Columns(rowIndex, implementable, control, List.copyOf(featureColumns));
            }
        }
        return null;
    }

    private static boolean isFeatureHeader(final String header) {
        if (!header.contains("feature")) {
            return false;
        }
        if (header.contains("implementation level") && (header.contains("related") || header.contains("yes no"))) {
            return false;
        }
        return header.contains("security feature") || header.contains("taxonomy") || header.contains("mapping")
                || header.equals("feature") || header.equals("features");
    }

    private static boolean isControlHeader(final String header) {
        return header.equals("id") || header.equals("identifier") || header.equals("chapter")
                || header.equals("control") || header.equals("control id") || header.equals("control identifier")
                || header.equals("number") || header.contains("control number") || header.contains("requirement id")
                || header.contains("chapter id") || header.contains("subcategory id")
                || header.startsWith("category subcategory");
    }

    private static String findControl(final List<String> row, final int controlColumn, final String standard) {
        if (controlColumn >= 0) {
            final String explicit = extractControl(value(row, controlColumn), standard);
            if (!explicit.isBlank()) {
                return explicit;
            }
        }
        for (final String cell : row) {
            final String candidate = extractControl(cell, standard);
            if (!candidate.isBlank()) {
                return candidate;
            }
        }
        return "";
    }

    private static String extractControl(final String value, final String standard) {
        if (value == null || value.isBlank()) {
            return "";
        }
        final String normalizedStandard = standard.toLowerCase(Locale.ROOT);
        final Pattern pattern;
        if (normalizedStandard.contains("27001") || normalizedStandard.contains("27002")) {
            pattern = ISO_CONTROL;
        } else if (normalizedStandard.contains("cybersecurity framework")) {
            pattern = CSF_CONTROL;
        } else if (normalizedStandard.contains("800-53")) {
            pattern = NIST_CONTROL;
        } else if (normalizedStandard.contains("common criteria")) {
            pattern = CC_CONTROL;
        } else {
            return value.trim();
        }
        final Matcher matcher = pattern.matcher(value);
        return matcher.find() ? matcher.group().replaceAll("\\s+", "") : "";
    }

    private static String canonicalFeature(final String standard, final String control, final String rawFeature) {
        if ("Common Criteria".equals(standard) && "15.12".equals(control)
                && "system state protection".equals(normalize(rawFeature))) {
            return "state synchronization";
        }
        return EmseSecurityFeatureTaxonomy.canonicalizeWorkbookFeature(rawFeature);
    }

    private static List<String> splitFeatures(final String value) {
        if (value == null || value.isBlank()) {
            return List.of();
        }
        final String cleaned = value.replace('\r', '\n').replace('•', '\n');
        final List<String> features = new ArrayList<>();
        for (final String part : cleaned.split("[\\n;,]+")) {
            String feature = part.trim().replaceFirst("^[-*]+\\s*", "");
            if (feature.isBlank() || isBooleanWord(feature)) {
                continue;
            }
            feature = feature.replaceFirst("(?i)^feature\\s*:\\s*", "").trim();
            if (!normalize(feature).isBlank()) {
                features.add(feature);
            }
        }
        return features;
    }

    private static String standardName(final String sheetName) {
        final String normalized = sheetName == null ? "" : sheetName.toLowerCase(Locale.ROOT);
        if (normalized.contains("27001")) {
            return "ISO/IEC 27001:2022";
        }
        if (normalized.contains("27002")) {
            return "ISO/IEC 27002:2022";
        }
        if (normalized.contains("800") && normalized.contains("53")) {
            return "NIST SP 800-53";
        }
        if (normalized.contains("cybersecurity") || normalized.contains("csf")) {
            return "NIST Cybersecurity Framework";
        }
        if (normalized.contains("common criteria") || normalized.matches(".*\\bcc\\b.*")) {
            return "Common Criteria";
        }
        return sheetName == null ? "" : sheetName.trim();
    }

    private static boolean isYes(final String value) {
        final String normalized = value == null ? "" : value.trim().toLowerCase(Locale.ROOT);
        return normalized.equals("yes") || normalized.equals("y") || normalized.equals("true")
                || normalized.equals("1") || normalized.startsWith("yes ") || normalized.startsWith("yes(");
    }

    private static boolean isBooleanWord(final String value) {
        final String normalized = value.trim().toLowerCase(Locale.ROOT);
        return normalized.equals("yes") || normalized.equals("no") || normalized.equals("n/a")
                || normalized.equals("na") || normalized.equals("true") || normalized.equals("false");
    }

    private static String value(final List<String> row, final int column) {
        return column >= 0 && column < row.size() ? row.get(column).trim() : "";
    }

    private static String normalizeHeader(final String value) {
        return normalize(value);
    }

    private static String normalize(final String value) {
        return value == null ? ""
                : value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", " ").trim().replaceAll("\\s+", " ");
    }
}
