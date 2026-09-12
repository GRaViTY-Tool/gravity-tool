package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/** Minimal XLSX reader for the tabular EMSE replication-package workbook. */
final class XlsxWorkbookReader {

    record Sheet(String name, List<List<String>> rows) {
        Sheet {
            rows = List.copyOf(rows);
        }
    }

    private static final String SPREADSHEET_NS = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
    private static final String OFFICE_REL_NS = "http://schemas.openxmlformats.org/officeDocument/2006/relationships";
    private static final String PACKAGE_REL_NS = "http://schemas.openxmlformats.org/package/2006/relationships";

    private XlsxWorkbookReader() {
    }

    static List<Sheet> read(final Path path) throws IOException {
        try (ZipFile zip = new ZipFile(path.toFile())) {
            final List<String> sharedStrings = readSharedStrings(zip);
            final Map<String, String> relationships = readWorkbookRelationships(zip);
            final Document workbook = readXml(zip, "xl/workbook.xml");
            final List<Sheet> result = new ArrayList<>();
            final NodeList sheets = workbook.getElementsByTagNameNS(SPREADSHEET_NS, "sheet");
            for (int i = 0; i < sheets.getLength(); i++) {
                final Element sheet = (Element) sheets.item(i);
                final String name = sheet.getAttribute("name");
                final String relationshipId = sheet.getAttributeNS(OFFICE_REL_NS, "id");
                final String target = relationships.get(relationshipId);
                if (target == null || target.isBlank()) {
                    continue;
                }
                result.add(new Sheet(name, readSheet(zip, normalizeTarget(target), sharedStrings)));
            }
            return List.copyOf(result);
        }
    }

    private static List<String> readSharedStrings(final ZipFile zip) throws IOException {
        if (zip.getEntry("xl/sharedStrings.xml") == null) {
            return List.of();
        }
        final Document document = readXml(zip, "xl/sharedStrings.xml");
        final NodeList items = document.getElementsByTagNameNS(SPREADSHEET_NS, "si");
        final List<String> values = new ArrayList<>(items.getLength());
        for (int i = 0; i < items.getLength(); i++) {
            final NodeList textNodes = ((Element) items.item(i)).getElementsByTagNameNS(SPREADSHEET_NS, "t");
            final StringBuilder value = new StringBuilder();
            for (int j = 0; j < textNodes.getLength(); j++) {
                value.append(textNodes.item(j).getTextContent());
            }
            values.add(value.toString());
        }
        return values;
    }

    private static Map<String, String> readWorkbookRelationships(final ZipFile zip) throws IOException {
        final Document document = readXml(zip, "xl/_rels/workbook.xml.rels");
        final NodeList relationships = document.getElementsByTagNameNS(PACKAGE_REL_NS, "Relationship");
        final Map<String, String> result = new LinkedHashMap<>();
        for (int i = 0; i < relationships.getLength(); i++) {
            final Element relationship = (Element) relationships.item(i);
            result.put(relationship.getAttribute("Id"), relationship.getAttribute("Target"));
        }
        return result;
    }

    private static List<List<String>> readSheet(final ZipFile zip, final String entryName,
            final List<String> sharedStrings) throws IOException {
        final Document document = readXml(zip, entryName);
        final NodeList rows = document.getElementsByTagNameNS(SPREADSHEET_NS, "row");
        final List<List<String>> result = new ArrayList<>(rows.getLength());
        for (int i = 0; i < rows.getLength(); i++) {
            final Element row = (Element) rows.item(i);
            final NodeList cells = row.getElementsByTagNameNS(SPREADSHEET_NS, "c");
            final Map<Integer, String> values = new HashMap<>();
            int maxColumn = -1;
            for (int j = 0; j < cells.getLength(); j++) {
                final Element cell = (Element) cells.item(j);
                final int column = columnIndex(cell.getAttribute("r"));
                maxColumn = Math.max(maxColumn, column);
                values.put(column, cellValue(cell, sharedStrings));
            }
            final List<String> data = new ArrayList<>(Math.max(0, maxColumn + 1));
            for (int column = 0; column <= maxColumn; column++) {
                data.add(values.getOrDefault(column, ""));
            }
            result.add(data);
        }
        return result;
    }

    private static String cellValue(final Element cell, final List<String> sharedStrings) {
        final String type = cell.getAttribute("t");
        if ("inlineStr".equals(type)) {
            final NodeList texts = cell.getElementsByTagNameNS(SPREADSHEET_NS, "t");
            final StringBuilder value = new StringBuilder();
            for (int i = 0; i < texts.getLength(); i++) {
                value.append(texts.item(i).getTextContent());
            }
            return value.toString();
        }
        final NodeList values = cell.getElementsByTagNameNS(SPREADSHEET_NS, "v");
        if (values.getLength() == 0) {
            return "";
        }
        final String raw = values.item(0).getTextContent();
        if ("s".equals(type)) {
            try {
                final int index = Integer.parseInt(raw.trim());
                return index >= 0 && index < sharedStrings.size() ? sharedStrings.get(index) : "";
            } catch (final NumberFormatException ignored) {
                return "";
            }
        }
        return raw;
    }

    private static int columnIndex(final String reference) {
        int result = 0;
        int letters = 0;
        for (int i = 0; i < reference.length(); i++) {
            final char character = Character.toUpperCase(reference.charAt(i));
            if (character < 'A' || character > 'Z') {
                break;
            }
            result = result * 26 + (character - 'A' + 1);
            letters++;
        }
        return letters == 0 ? 0 : result - 1;
    }

    private static String normalizeTarget(final String target) {
        String normalized = target.replace('\\', '/');
        while (normalized.startsWith("../")) {
            normalized = normalized.substring(3);
        }
        if (normalized.startsWith("/")) {
            normalized = normalized.substring(1);
        }
        return normalized.startsWith("xl/") ? normalized : "xl/" + normalized;
    }

    private static Document readXml(final ZipFile zip, final String entryName) throws IOException {
        final ZipEntry entry = zip.getEntry(entryName);
        if (entry == null) {
            throw new IOException("Missing XLSX entry: " + entryName);
        }
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            factory.setXIncludeAware(false);
            factory.setExpandEntityReferences(false);
            try (InputStream input = zip.getInputStream(entry)) {
                return factory.newDocumentBuilder().parse(input);
            }
        } catch (ParserConfigurationException | SAXException e) {
            throw new IOException("Cannot parse XLSX entry " + entryName, e);
        }
    }
}
