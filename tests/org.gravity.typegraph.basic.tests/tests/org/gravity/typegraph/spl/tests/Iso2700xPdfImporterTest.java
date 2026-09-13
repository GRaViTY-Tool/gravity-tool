package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.gravity.typegraph.spl.standards.Iso2700xPdfImporter;
import org.junit.Test;

public class Iso2700xPdfImporterTest {

    @Test
    public void extractsAllInformationSecurityPropertiesNotOnlyCia() {
        final var controls = Iso2700xPdfImporter.parseControls("""
                8.24 Use of cryptography
                Control text.
                Information security properties
                #Confidentiality #Integrity #Authenticity #Accountability #Non-repudiation #Resistance
                Cybersecurity concepts
                #Protect
                """, Iso2700xPdfImporter.StandardKind.ISO_IEC_27002_2022);

        assertEquals(1, controls.size());
        assertEquals(Set.of("Confidentiality", "Integrity", "Authenticity", "Accountability", "Non-repudiation",
                "Resistance"), controls.get(0).securityProperties());
    }

    @Test
    public void retainsPlainTextFallbackForSecurityPropertiesPlusAvailability() {
        final var controls = Iso2700xPdfImporter.parseControls("""
                5.17 Authentication information
                Information security properties
                Confidentiality Integrity Non-repudiation Accountability Authenticity Resistance Availability
                Control type
                Preventive
                """, Iso2700xPdfImporter.StandardKind.ISO_IEC_27002_2022);

        assertEquals(Set.of("Confidentiality", "Integrity", "Non-repudiation", "Accountability", "Authenticity",
                "Resistance", "Availability"), controls.get(0).securityProperties());
    }

    @Test
    public void hashtagParsingRemainsOpenEnded() {
        final var controls = Iso2700xPdfImporter.parseControls("""
                5.30 ICT readiness for business continuity
                Information security properties
                #Availability #Future-property
                Control type
                Preventive
                """, Iso2700xPdfImporter.StandardKind.ISO_IEC_27002_2022);

        assertEquals(Set.of("Availability", "Future-property"), controls.get(0).securityProperties());
    }
}
