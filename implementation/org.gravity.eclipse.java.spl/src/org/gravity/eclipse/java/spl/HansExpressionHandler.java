package org.gravity.eclipse.java.spl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parses the embedded feature annotations used by HAnS.
 *
 * <p>HAnS supports {@code &begin[feature]}, {@code &end[feature]} and
 * {@code &line[feature]}. Feature references may be location/path qualified
 * using {@code ::}. Multiple references in one annotation are returned as
 * separate feature expressions so that GRaViTY can attach them individually.</p>
 *
 * <p>A begin/end annotation applies to an {@link ElementPosition} only if the
 * complete program element is enclosed by the block. A line annotation applies
 * to an element whose start position is on the annotated source line. This
 * mirrors the granularity at which {@link JavaProjectSplDiscoverer} maps source
 * positions to program-model elements.</p>
 *
 * @param <T> type of represented program-model elements
 */
public final class HansExpressionHandler<T> {

    private static final Pattern MARKER = Pattern.compile("&(begin|end|line)\\s*\\[([^\\]]*)\\]");
    private static final Pattern FEATURE = Pattern.compile("[A-Za-z0-9_']+(?:::[A-Za-z0-9_']+)*");

    private final CharSequence contents;
    private final List<BlockAnnotation> blocks = new ArrayList<>();
    private final List<LineAnnotation> lines = new ArrayList<>();
    private boolean containsAnnotations;

    public HansExpressionHandler(final CharSequence contents) {
        this.contents = contents == null ? "" : contents;
        parse();
    }

    public boolean containsHansAnnotations() {
        return this.containsAnnotations;
    }

    /**
     * Returns all HAnS feature references applying to the given program element.
     */
    public Set<String> getSurroundingHansAnnotations(final ElementPosition<? extends T> position) {
        final Set<String> result = new LinkedHashSet<>();
        if (position == null) {
            return result;
        }

        for (final BlockAnnotation block : this.blocks) {
            if ((block.beginEnd() <= position.getStartIndex())
                    && (block.endStart() >= position.getEndIndex())) {
                result.addAll(block.features());
            }
        }

        final int elementLineStart = lineStart(position.getStartIndex());
        final int elementLineEnd = lineEnd(position.getStartIndex());
        for (final LineAnnotation line : this.lines) {
            if ((line.markerStart() >= elementLineStart) && (line.markerStart() <= elementLineEnd)) {
                result.addAll(line.features());
            }
        }
        return result;
    }

    /**
     * Returns all feature references occurring in HAnS annotations.
     */
    public Set<String> getReferencedFeatures() {
        final Set<String> result = new LinkedHashSet<>();
        this.blocks.forEach(block -> result.addAll(block.features()));
        this.lines.forEach(line -> result.addAll(line.features()));
        return result;
    }

    private void parse() {
        final Matcher matcher = MARKER.matcher(this.contents);
        final Deque<OpenAnnotation> stack = new ArrayDeque<>();
        while (matcher.find()) {
            this.containsAnnotations = true;
            final String kind = matcher.group(1);
            final Set<String> features = parseFeatures(matcher.group(2), matcher.start());
            switch (kind) {
            case "begin" -> stack.push(new OpenAnnotation(matcher.start(), matcher.end(), features));
            case "end" -> closeBlock(stack, features, matcher.start());
            case "line" -> this.lines.add(new LineAnnotation(matcher.start(), features));
            default -> throw new IllegalStateException("Unknown HAnS annotation kind: " + kind);
            }
        }
        if (!stack.isEmpty()) {
            final OpenAnnotation open = stack.peek();
            throw new IllegalStateException("Unclosed HAnS &begin annotation at index " + open.beginStart()
                    + " for " + open.features());
        }
    }

    private void closeBlock(final Deque<OpenAnnotation> stack, final Set<String> features, final int endStart) {
        if (stack.isEmpty()) {
            throw new IllegalStateException("HAnS &end annotation at index " + endStart + " has no matching &begin");
        }
        final OpenAnnotation open = stack.pop();
        if (!open.features().equals(features)) {
            throw new IllegalStateException("HAnS &end annotation at index " + endStart + " closes " + features
                    + " but the innermost &begin at index " + open.beginStart() + " opens " + open.features());
        }
        this.blocks.add(new BlockAnnotation(open.beginStart(), open.beginEnd(), endStart, open.features()));
    }

    private Set<String> parseFeatures(final String parameter, final int markerStart) {
        final Set<String> result = new LinkedHashSet<>();
        if (parameter == null || parameter.isBlank()) {
            throw new IllegalStateException("Empty HAnS feature annotation at index " + markerStart);
        }

        final String[] tokens = parameter.trim().split("(?:\\s*,\\s*|\\s+)");
        for (final String token : tokens) {
            if (token.isBlank()) {
                continue;
            }
            if (!FEATURE.matcher(token).matches()) {
                throw new IllegalStateException("Invalid HAnS feature reference '" + token + "' at index "
                        + markerStart);
            }
            result.add(token);
        }
        if (result.isEmpty()) {
            throw new IllegalStateException("Empty HAnS feature annotation at index " + markerStart);
        }
        return Set.copyOf(result);
    }

    private int lineStart(final int offset) {
        final int safeOffset = Math.max(0, Math.min(offset, this.contents.length()));
        for (int i = safeOffset - 1; i >= 0; i--) {
            final char ch = this.contents.charAt(i);
            if ((ch == '\n') || (ch == '\r')) {
                return i + 1;
            }
        }
        return 0;
    }

    private int lineEnd(final int offset) {
        final int safeOffset = Math.max(0, Math.min(offset, this.contents.length()));
        for (int i = safeOffset; i < this.contents.length(); i++) {
            final char ch = this.contents.charAt(i);
            if ((ch == '\n') || (ch == '\r')) {
                return i;
            }
        }
        return this.contents.length();
    }

    /** True if the text contains at least one HAnS embedded annotation marker. */
    static boolean containsMarker(final CharSequence text) {
        return text != null && MARKER.matcher(text).find();
    }

    /**
     * Removes comment text while preserving HAnS markers and line separators.
     * This prevents braces or Java-looking text inside an annotation comment
     * from interfering with the existing source-position parser.
     */
    static String retainMarkersAndLineBreaks(final CharSequence text) {
        if (text == null) {
            return "";
        }
        final char[] result = new char[text.length()];
        for (int i = 0; i < result.length; i++) {
            final char ch = text.charAt(i);
            result[i] = (ch == '\r' || ch == '\n') ? ch : ' ';
        }
        final Matcher matcher = MARKER.matcher(text);
        while (matcher.find()) {
            for (int i = matcher.start(); i < matcher.end(); i++) {
                result[i] = text.charAt(i);
            }
        }
        return new String(result);
    }

    private record OpenAnnotation(int beginStart, int beginEnd, Set<String> features) {
    }

    private record BlockAnnotation(int beginStart, int beginEnd, int endStart, Set<String> features) {
    }

    private record LineAnnotation(int markerStart, Set<String> features) {
    }
}
