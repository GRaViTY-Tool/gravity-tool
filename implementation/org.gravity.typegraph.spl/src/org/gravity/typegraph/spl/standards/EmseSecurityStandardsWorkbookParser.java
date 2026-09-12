package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Public entry point for the standards-to-taxonomy mappings in the EMSE
 * replication-package workbook "2) Systematic Review - Security Standards.xlsx".
 * <p>
 * The workbook is authoritative. Labels used during the standards review are
 * reconciled with the final 68-feature taxonomy by
 * {@link EmseSecurityFeatureTaxonomy}. Each generated control reference retains
 * the workbook sheet, row, and original label in its source provenance.
 */
public final class EmseSecurityStandardsWorkbookParser {

    public static final String REPLICATION_PACKAGE_DOI = EmseSecurityStandardsWorkbookParser2.REPLICATION_PACKAGE_DOI;
    public static final String WORKBOOK_NAME = EmseSecurityStandardsWorkbookParser2.WORKBOOK_NAME;
    public static final String WORKBOOK_MD5 = EmseSecurityStandardsWorkbookParser2.WORKBOOK_MD5;

    public record ParseResult(FeatureMappingCatalog catalog, int mappingCount, List<String> mappedSheets) {
        public ParseResult {
            mappedSheets = List.copyOf(mappedSheets);
        }
    }

    private EmseSecurityStandardsWorkbookParser() {
    }

    public static FeatureMappingCatalog parse(final Path workbook) throws IOException {
        return EmseSecurityStandardsWorkbookParser2.parse(workbook);
    }

    public static ParseResult parseWithDiagnostics(final Path workbook) throws IOException {
        final var result = EmseSecurityStandardsWorkbookParser2.parseWithDiagnostics(workbook);
        return new ParseResult(result.catalog(), result.mappingCount(), result.mappedSheets());
    }
}
