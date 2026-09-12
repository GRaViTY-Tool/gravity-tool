package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.gravity.typegraph.spl.standards.EmseSecurityStandardsWorkbookParser;
import org.junit.Test;

public class EmseSecurityStandardsWorkbookParserTest {

    @Test
    public void readsMappingsFromReplicationWorkbookShape() throws IOException {
        final Path workbook = Files.createTempFile("emse-security-standards", ".xlsx");
        try {
            writeWorkbook(workbook);

            final var result = EmseSecurityStandardsWorkbookParser.parseWithDiagnostics(workbook);

            assertEquals(2, result.catalog().entries().size());
            assertEquals(2, result.mappingCount());
            assertEquals(1, result.mappedSheets().size());
            final var cryptography = result.catalog().resolve("cryptography", "cryptography").orElseThrow();
            assertEquals(1, cryptography.controls().size());
            assertEquals("ISO/IEC 27002:2022", cryptography.controls().get(0).standard());
            assertEquals("8.24", cryptography.controls().get(0).control());
            assertTrue(cryptography.controls().get(0).source().contains("11091429"));
            assertTrue(result.catalog().resolve("encryption", "encryption").isPresent());
        } finally {
            Files.deleteIfExists(workbook);
        }
    }

    private static void writeWorkbook(final Path path) throws IOException {
        try (ZipOutputStream zip = new ZipOutputStream(Files.newOutputStream(path))) {
            entry(zip, "xl/workbook.xml", """
                    <?xml version="1.0" encoding="UTF-8"?>
                    <workbook xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main"
                        xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships">
                      <sheets><sheet name="ISO 27002" sheetId="1" r:id="rId1"/></sheets>
                    </workbook>
                    """);
            entry(zip, "xl/_rels/workbook.xml.rels", """
                    <?xml version="1.0" encoding="UTF-8"?>
                    <Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships">
                      <Relationship Id="rId1" Target="worksheets/sheet1.xml"
                        Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet"/>
                    </Relationships>
                    """);
            entry(zip, "xl/worksheets/sheet1.xml", """
                    <?xml version="1.0" encoding="UTF-8"?>
                    <worksheet xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main">
                      <sheetData>
                        <row r="1">
                          <c r="A1" t="inlineStr"><is><t>Control</t></is></c>
                          <c r="B1" t="inlineStr"><is><t>Related to implementation-level feature? (yes/no)</t></is></c>
                          <c r="C1" t="inlineStr"><is><t>Security feature(s)</t></is></c>
                        </row>
                        <row r="2">
                          <c r="A2" t="inlineStr"><is><t>8.24 Use of cryptography</t></is></c>
                          <c r="B2" t="inlineStr"><is><t>yes</t></is></c>
                          <c r="C2" t="inlineStr"><is><t>cryptography; encryption</t></is></c>
                        </row>
                        <row r="3">
                          <c r="A3" t="inlineStr"><is><t>8.14 Redundancy</t></is></c>
                          <c r="B3" t="inlineStr"><is><t>no</t></is></c>
                          <c r="C3" t="inlineStr"><is><t>resource management</t></is></c>
                        </row>
                      </sheetData>
                    </worksheet>
                    """);
        }
    }

    private static void entry(final ZipOutputStream zip, final String name, final String content) throws IOException {
        zip.putNextEntry(new ZipEntry(name));
        zip.write(content.stripLeading().getBytes(StandardCharsets.UTF_8));
        zip.closeEntry();
    }
}
