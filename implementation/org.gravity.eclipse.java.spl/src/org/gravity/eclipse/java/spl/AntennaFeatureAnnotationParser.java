package org.gravity.eclipse.java.spl;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parser for Antenna preprocessor-style feature annotations.
 *
 * @param <T> type of represented program-model elements
 */
public class AntennaFeatureAnnotationParser<T> extends AbstractFeatureAnnotationParser<T> {

    private static final String EXPR = "##expr##";
    private static final String ANTENNA_IF_REGEX = "//\\s*#if(def)?";
    private static final String ANTENNA_ELIF_REGEX = "//\\s*#elif";
    private static final String ANTENNA_ELSE_REGEX = "//\\s*#else";
    private static final String ANTENNA_ENDIF_REGEX = "//\\s*#endif";

    private final List<Integer> ifStart = new LinkedList<>();
    private final List<Integer> elifStart = new LinkedList<>();
    private final List<String> ifExpr = new LinkedList<>();
    private final List<String> elifExpr = new LinkedList<>();

    private final HashMap<Integer, Integer> next = new HashMap<>();
    private final HashMap<Integer, Integer> previous = new HashMap<>();
    private final SortedMap<Integer, String> sortedExprs;

    public AntennaFeatureAnnotationParser(final CharSequence contents) {
        super(contents);
        this.sortedExprs = getPositionsOfAnnotations(contents());

        final Deque<Integer> stack = new LinkedList<>();
        for (final Entry<Integer, String> entry : this.sortedExprs.entrySet()) {
            final int current = entry.getKey();
            final String value = entry.getValue();
            if (value.contains("elif") || value.contains("else")) {
                if (stack.isEmpty()) {
                    throw new IllegalStateException("Antenna branch without matching #if at index " + current);
                }
                final Integer previousBranch = stack.pop();
                this.next.put(previousBranch, current);
                this.previous.put(current, previousBranch);
                stack.add(current);
            } else if (value.contains("endif")) {
                if (stack.isEmpty()) {
                    throw new IllegalStateException("Antenna #endif without matching #if at index " + current);
                }
                final Integer previousBranch = stack.pop();
                this.next.put(previousBranch, current);
                this.previous.put(current, previousBranch);
            } else if (value.contains("if")) {
                stack.add(current);
            } else {
                throw new IllegalStateException("Unknown Antenna expression: " + value);
            }
        }
        if (!stack.isEmpty()) {
            throw new IllegalStateException("Unclosed Antenna #if annotation at index " + stack.peek());
        }
    }

    @Override
    public String id() {
        return "antenna";
    }

    @Override
    public boolean containsAnnotations() {
        return !this.sortedExprs.isEmpty();
    }

    private SortedMap<Integer, String> getPositionsOfAnnotations(final CharSequence contents) {
        final SortedMap<Integer, String> sorted = new TreeMap<>();

        final Matcher ifMatcher = Pattern.compile(ANTENNA_IF_REGEX + ".*(\\r|\\n)").matcher(contents);
        while (ifMatcher.find()) {
            final String group = ifMatcher.group();
            final int start = ifMatcher.start();
            this.ifStart.add(start);
            this.ifExpr.add(group.replaceAll(ANTENNA_IF_REGEX + "\\s*", "").replaceAll("\\s*(\\r|\\n)", ""));
            sorted.put(start, group);
        }

        final Matcher elifMatcher = Pattern.compile(ANTENNA_ELIF_REGEX + ".*(\\r|\\n)").matcher(contents);
        while (elifMatcher.find()) {
            final String group = elifMatcher.group();
            final int start = elifMatcher.start();
            this.elifStart.add(start);
            this.elifExpr.add(group.replaceAll(ANTENNA_ELIF_REGEX + "\\s*", "").replaceAll("\\s*(\\r|\\n)", ""));
            sorted.put(start, group);
        }

        final Matcher elseMatcher = Pattern.compile(ANTENNA_ELSE_REGEX + ".*(\\r|\\n)").matcher(contents);
        while (elseMatcher.find()) {
            sorted.put(elseMatcher.start(), elseMatcher.group());
        }

        final Matcher endifMatcher = Pattern.compile(ANTENNA_ENDIF_REGEX + ".*(\\r|\\n|$)").matcher(contents);
        while (endifMatcher.find()) {
            sorted.put(endifMatcher.start(), endifMatcher.group());
        }
        return sorted;
    }

    /**
     * Gets the effective expression for the Antenna branch starting at the given
     * source index.
     */
    public String getExpression(final int startIndex) {
        String expression = EXPR;
        int index = startIndex;
        while (index >= 0) {
            final String value = this.sortedExprs.get(index);
            if (value == null) {
                throw new IllegalArgumentException("No Antenna annotation at index " + index);
            }
            if (value.contains("elif")) {
                expression = expression.replace(EXPR,
                        "!(" + EXPR + ") && " + this.elifExpr.get(this.elifStart.indexOf(index)));
                index = this.previous.get(index);
            } else if (value.contains("else")) {
                expression = expression.replace(EXPR, "!(" + EXPR + ")");
                index = this.previous.get(index);
            } else if (value.contains("endif")) {
                throw new IllegalStateException("#endif cannot start an Antenna expression");
            } else if (value.contains("if")) {
                expression = expression.replace(EXPR, this.ifExpr.get(this.ifStart.indexOf(index)));
                index = -1;
            } else {
                throw new IllegalStateException("Unknown Antenna expression: " + value);
            }
        }
        return expression;
    }

    @Override
    public Set<String> getSurroundingAnnotations(final ElementPosition<? extends T> position) {
        final Set<String> surrounding = new LinkedHashSet<>();
        if (position == null) {
            return surrounding;
        }
        for (final Integer annotation : this.sortedExprs.headMap(position.getStartIndex()).keySet()) {
            if (this.next.containsKey(annotation) && (this.next.get(annotation) > position.getEndIndex())) {
                surrounding.add(getExpression(annotation));
            }
        }
        return surrounding;
    }
}
