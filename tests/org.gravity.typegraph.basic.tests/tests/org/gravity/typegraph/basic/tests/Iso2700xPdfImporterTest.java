package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.gravity.typegraph.spl.standards.Iso2700xPdfImporter;
import org.gravity.typegraph.spl.standards.Iso2700xPdfImporter.StandardKind;
import org.junit.Test;

public class Iso2700xPdfImporterTest {

    @Test
    public void parsesIso27002ControlsAndSecurityProperties() {
        final String text = "5.17 Authentication information\n"
                + "Control type Preventive\n"
                + "Information security properties Confidentiality Integrity Availability\n"
                + "Cybersecurity concepts Protect\n"
                + "Guidance explanatory text mentioning other concepts\n"
                + "8.24 Use of cryptography\n"
                + "Information security properties Confidentiality Integrity\n"
                + "Operational capabilities Cryptography\n";

        final var controls = Iso2700xPdfImporter.parseControls(text, StandardKind.ISO_IEC_27002_2022);

        assertEquals(2, controls.size());
        assertEquals("5.17", controls.get(0).identifier());
        assertEquals("Authentication information", controls.get(0).title());
        assertEquals(3, controls.get(0).securityProperties().size());
        assertTrue(controls.get(0).securityProperties().contains("Confidentiality"));
        assertTrue(controls.get(0).securityProperties().contains("Integrity"));
        assertTrue(controls.get(0).securityProperties().contains("Availability"));
        assertEquals(2, controls.get(1).securityProperties().size());
    }

    @Test
    public void iso27001OnlyParsesAnnexAControls() {
        final String text = "5.1 Understanding the organization and its context\n"
                + "This is a management-system clause, not Annex A.\n"
                + "A.5.1 Policies for information security\n"
                + "Control text\n"
                + "A.8.24 Use of cryptography\n"
                + "Control text\n";

        final var controls = Iso2700xPdfImporter.parseControls(text, StandardKind.ISO_IEC_27001_2022);

        assertEquals(2, controls.size());
        assertEquals("A.5.1", controls.get(0).identifier());
        assertEquals("A.8.24", controls.get(1).identifier());
    }

    @Test
    public void ignoresPropertyWordsOutsideTheAttributeBlock() {
        final String text = "8.1 Example control\n"
                + "Information security properties Integrity\n"
                + "Cybersecurity concepts Protect\n"
                + "Guidance Confidentiality and Availability are discussed later\n";

        final var controls = Iso2700xPdfImporter.parseControls(text, StandardKind.ISO_IEC_27002_2022);

        assertEquals(1, controls.size());
        assertEquals(1, controls.get(0).securityProperties().size());
        assertTrue(controls.get(0).securityProperties().contains("Integrity"));
    }
}
