package org.gravity.eclipse.java.spl;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AntennaExpressionHandler<T> {

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

	public AntennaExpressionHandler(final CharSequence contents) {
		this.sortedExprs = getPositionsOfAntennaAnnotations(contents);

		final Deque<Integer> stack = new LinkedList<>();
		for (final Entry<Integer, String> entry : this.sortedExprs.entrySet()) {
			final int nex = entry.getKey();
			final String value = entry.getValue();
			if (value.contains("elif") || value.contains("else")) {
				final Integer prev = stack.pop();
				this.next.put(prev, nex);
				this.previous.put(nex, prev);
				stack.add(nex);
			} else if (value.contains("endif")) {
				final Integer prev = stack.pop();
				this.next.put(prev, nex);
				this.previous.put(nex, prev);
			} else if (value.contains("if")) {
				stack.add(nex);
			} else {
				throw new IllegalStateException("Unknown expression: " + value);
			}
		}
	}

	public boolean containsAntennaAnnotations() {
		return !this.sortedExprs.isEmpty();
	}

	private SortedMap<Integer, String> getPositionsOfAntennaAnnotations(final CharSequence contents) {
		final SortedMap<Integer, String> sorted = new TreeMap<>();

		final List<String> ifs = new ArrayList<>();
		final Matcher ifMatcher = Pattern.compile(ANTENNA_IF_REGEX + ".*(\r|\n)").matcher(contents);
		while (ifMatcher.find()) {
			final String group = ifMatcher.group();
			final int start = ifMatcher.start();
			ifs.add(group);
			this.ifStart.add(start);
			this.ifExpr.add(group.replaceAll(ANTENNA_IF_REGEX + "\\s*", "").replaceAll("\\s*(\r|\n)", ""));
			sorted.put(start, group);
		}

		final List<String> elifs = new ArrayList<>();
		final Matcher elifM = Pattern.compile(ANTENNA_ELIF_REGEX + ".*(\r|\n)").matcher(contents);
		while (elifM.find()) {
			final String group = elifM.group();
			final int start = elifM.start();
			this.elifStart.add(start);
			elifs.add(group);
			this.elifExpr.add(group.replaceAll(ANTENNA_ELIF_REGEX + "\\s*", "").replaceAll("\\s*(\r|\n)", ""));
			sorted.put(start, group);
		}

		final List<String> elses = new ArrayList<>();
		final List<Integer> elseStart = new ArrayList<>();
		final Matcher elseMatcher = Pattern.compile(ANTENNA_ELSE_REGEX + ".*(\r|\n)").matcher(contents);
		while (elseMatcher.find()) {
			final String group = elseMatcher.group();
			elses.add(group);
			final int start = elseMatcher.start();
			elseStart.add(start);
			sorted.put(start, group);
		}

		final List<String> endifs = new ArrayList<>();
		final List<Integer> endifStart = new ArrayList<>();
		final Matcher endifM = Pattern.compile(ANTENNA_ENDIF_REGEX + ".*(\r|\n|$)").matcher(contents);
		while (endifM.find()) {
			final String group = endifM.group();
			endifs.add(group);
			final int start = endifM.start();
			endifStart.add(start);
			sorted.put(start, group);
		}
		return sorted;
	}

	/**
	 * Gets the expression starting at the given index
	 *
	 * @param startIndex The start index
	 * @return The expression
	 */
	public String getExpression(final int startIndex) {
		String expression = EXPR;

		int index = startIndex;
		while (index >= 0) {
			final String value = this.sortedExprs.get(index);
			if (value.contains("elif")) {
				expression = expression.replace(EXPR, "!(" + EXPR + ") && " + this.elifExpr.get(this.elifStart.indexOf(index)));
				index = this.previous.get(index);
			} else if (value.contains("else")) {
				expression = expression.replace(EXPR, "!(" + EXPR + ")");
				index = this.previous.get(index);
			} else if (value.contains("endif")) {
				throw new IllegalStateException();
			} else if (value.contains("if")) {
				expression = expression.replace(EXPR, this.ifExpr.get(this.ifStart.indexOf(index)));
				index = -1;
			} else {
				throw new IllegalStateException();
			}
		}
		return expression;
	}

	public Set<String> getSurroundingAntennaAnnotations(final ElementPosition<? extends T> position) {
		final Set<String> surrounding = new HashSet<>();

		for (final Integer annotation : this.sortedExprs.headMap(position.getStartIndex()).keySet()) {
			if (this.next.containsKey(annotation) && (this.next.get(annotation) > position.getEndIndex())) {
				surrounding.add(getExpression(annotation));
			}
		}
		return surrounding;
	}
}