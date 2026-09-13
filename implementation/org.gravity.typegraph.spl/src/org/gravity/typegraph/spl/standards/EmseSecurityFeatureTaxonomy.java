package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The 68 functional implementation-level security features from the final EMSE
 * taxonomy published by Hermann et al. (2025).
 * <p>
 * The aliases reconcile labels used in the standards-review replication
 * workbook with the names in the final taxonomy. They are deliberately kept
 * here, separate from HAnS parsing and program-model enrichment.
 */
public final class EmseSecurityFeatureTaxonomy {

    public static final String ARTICLE_DOI = "https://doi.org/10.1007/s10664-025-10649-7";
    public static final int FEATURE_COUNT = 68;

    private static final FeatureMappingCatalog CATALOG = createCatalog();

    private EmseSecurityFeatureTaxonomy() {
    }

    public static FeatureMappingCatalog catalog() {
        return CATALOG;
    }

    /**
     * Resolves a label used in the replication workbook to the corresponding
     * canonical name in the final 68-feature taxonomy. Unknown labels are returned
     * unchanged so callers can reject them explicitly.
     */
    public static String canonicalizeWorkbookFeature(final String label) {
        if (label == null || label.isBlank()) {
            return "";
        }
        return CATALOG.resolve(label, label).map(FeatureMappingCatalog.Entry::canonicalFeature).orElse(label.trim());
    }

    private static FeatureMappingCatalog createCatalog() {
        final List<FeatureMappingCatalog.Entry> entries = new ArrayList<>();

        entries.add(entry("access control"));
        entries.add(entry("authentication"));
        entries.add(entry("credentials"));
        entries.add(entry("one-time-password", "one time password", "one-time password"));
        entries.add(entry("certificate authentication"));
        entries.add(entry("multifactor authentication", "multi-factor authentication"));
        entries.add(entry("single sign-on", "single sign on"));
        entries.add(entry("authorization"));
        entries.add(entry("access quota limitation"));
        entries.add(entry("attribute-based access control", "attribute-based control"));
        entries.add(entry("discretionary access control"));
        entries.add(entry("mandatory access control"));
        entries.add(entry("lattice-based access control"));
        entries.add(entry("location-based access control"));
        entries.add(entry("role-based access control"));
        entries.add(entry("rule-based access control"));
        entries.add(entry("timed access control"));
        entries.add(entry("state-based access control"));
        entries.add(entry("application mode-based access control"));

        entries.add(entry("cryptography", "secure communication"));
        entries.add(entry("encryption"));
        entries.add(entry("stream ciphers"));
        entries.add(entry("block ciphers"));
        entries.add(entry("symmetric key cryptography"));
        entries.add(entry("asymmetric key cryptography"));
        entries.add(entry("hybrid cryptosystems"));
        entries.add(entry("cryptographic hashing", "hashing"));
        entries.add(entry("key management"));
        entries.add(entry("key generation"));
        entries.add(entry("key distribution"));
        entries.add(entry("group key management"));
        entries.add(entry("key storage"));
        entries.add(entry("key revocation"));
        entries.add(entry("signature", "signatures"));
        entries.add(entry("message signing"));
        entries.add(entry("certification", "certificates"));
        entries.add(entry("message authentication"));
        entries.add(entry("digital watermarking"));
        entries.add(entry("steganography"));

        entries.add(entry("security monitoring", "Intrusion Detection", "securtiy monitoring"));
        entries.add(entry("automated response", "Intrusion Detection response"));
        entries.add(entry("history maintenance"));
        entries.add(entry("logging"));

        entries.add(entry("secure data handling"));
        entries.add(entry("data validation", "validation"));
        entries.add(entry("input validation"));
        entries.add(entry("blacklisting"));
        entries.add(entry("whitelisting"));
        entries.add(entry("download verification"));
        entries.add(entry("output validation"));
        entries.add(entry("data sanitization", "information flow control"));
        entries.add(entry("input sanitization"));
        entries.add(entry("output sanitization"));
        entries.add(entry("parameterized prepared statement"));
        entries.add(entry("retention control"));
        entries.add(entry("secure storage"));
        entries.add(entry("trusted sources"));
        entries.add(entry("time source", "trusted source of time"));
        entries.add(entry("source of randomness", "randomness"));

        entries.add(entry("system state protection"));
        entries.add(entry("system state validation"));
        entries.add(entry("resource management"));
        entries.add(entry("state synchronization", "state synchrony protocol"));
        entries.add(entry("session management"));
        entries.add(entry("replay attack prevention"));
        entries.add(entry("session fixation protection"));
        entries.add(entry("session takeover prevention"));
        entries.add(entry("session timeout"));

        if (entries.size() != FEATURE_COUNT) {
            throw new IllegalStateException("Expected " + FEATURE_COUNT + " EMSE taxonomy features but got "
                    + entries.size());
        }
        return new FeatureMappingCatalog(entries);
    }

    private static FeatureMappingCatalog.Entry entry(final String canonical, final String... aliases) {
        return FeatureMappingCatalog.entry(canonical, Arrays.asList(aliases), List.of());
    }
}
