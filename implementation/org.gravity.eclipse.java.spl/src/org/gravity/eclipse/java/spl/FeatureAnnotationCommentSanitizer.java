package org.gravity.eclipse.java.spl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Removes ordinary Java comments before the legacy source-position parser runs,
 * while preserving Antenna directives and HAnS embedded annotations.
 */
final class FeatureAnnotationCommentSanitizer {

    private static final Pattern LINE_COMMENT = Pattern.compile("//[^\\r\\n]*(?:\\r\\n|\\r|\\n|$)");
    private static final Pattern BLOCK_COMMENT = Pattern.compile("/\\*(?s:.*?)\\*/");

    private FeatureAnnotationCommentSanitizer() {
    }

    static String sanitize(final String source) {
        String result = sanitizeMatches(source, LINE_COMMENT, true);
        result = sanitizeMatches(result, BLOCK_COMMENT, false);
        return result;
    }

    private static String sanitizeMatches(final String source, final Pattern pattern, final boolean lineComment) {
        final Matcher matcher = pattern.matcher(source);
        final StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            final String comment = matcher.group();
            final String replacement;
            if (lineComment && comment.matches("//\\s*#.*")) {
                // AntennaExpressionHandler needs the complete directive text.
                replacement = comment;
            } else if (HansExpressionHandler.containsMarker(comment)) {
                // Keep only HAnS markers/newlines so braces or Java-like text in
                // comments cannot interfere with element-position matching.
                replacement = HansExpressionHandler.retainMarkersAndLineBreaks(comment);
            } else {
                replacement = preserveLineBreaks(comment);
            }
            matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
        }
        matcher.appendTail(result);
        return result.toString();
    }

    private static String preserveLineBreaks(final CharSequence text) {
        final char[] result = new char[text.length()];
        for (int i = 0; i < result.length; i++) {
            final char ch = text.charAt(i);
            result[i] = (ch == '\r' || ch == '\n') ? ch : ' ';
        }
        return new String(result);
    }
}
