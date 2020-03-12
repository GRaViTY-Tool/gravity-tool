package org.gravity.eclipse.java.spl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.Deque;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AntennaExpressionHandler<T> {

	private static final String EXPR = "##expr##";
	private static final String ANTENNA_IF_REGEX = "//\\s*#if(def)?";
	private static final String ANTENNA_ELIF_REGEX = "//\\s*#elif";
	private static final String ANTENNA_ELSE_REGEX = "//\\s*#else";
	private static final String ANTENNA_ENDIF_REGEX = "//\\s*#endif";

	private List<Integer> ifStart = new LinkedList<>();
	private List<Integer> elifStart = new LinkedList<>();
	private List<String> ifExpr = new LinkedList<>();
	private List<String> elifExpr = new LinkedList<>();

	private HashMap<Integer, Integer> next = new HashMap<>();
	private HashMap<Integer, Integer> previous = new HashMap<>();
	private SortedMap<Integer, String> sortedExprs;

	public AntennaExpressionHandler(CharSequence contents) {
		sortedExprs = getPositionsOfAntennaAnnotations(contents);

		Deque<Integer> stack = new LinkedList<>();
		for (Entry<Integer, String> entry : sortedExprs.entrySet()) {
			int nex = entry.getKey();
			String value = entry.getValue();
			if (value.contains("elif") || value.contains("else")) {
				Integer prev = stack.pop();
				next.put(prev, nex);
				previous.put(nex, prev);
				stack.add(nex);
			} else if (value.contains("endif")) {
				Integer prev = stack.pop();
				next.put(prev, nex);
				previous.put(nex, prev);
			} else if (value.contains("if")) {
				stack.add(nex);
			} else {
				throw new IllegalStateException("Unknown expression: " + value);
			}
		}
	}

	private SortedMap<Integer, String> getPositionsOfAntennaAnnotations(CharSequence contents) {
		SortedMap<Integer, String> sorted = new TreeMap<>();

		List<String> ifs = new ArrayList<>();
		Matcher ifMatcher = Pattern.compile(ANTENNA_IF_REGEX + ".*(\r|\n)").matcher(contents);
		while (ifMatcher.find()) {
			String group = ifMatcher.group();
			int start = ifMatcher.start();
			ifs.add(group);
			ifStart.add(start);
			ifExpr.add(group.replaceAll(ANTENNA_IF_REGEX + "\\s*", "").replaceAll("\\s*(\r|\n)", ""));
			sorted.put(start, group);
		}

		List<String> elifs = new ArrayList<>();
		Matcher elifM = Pattern.compile(ANTENNA_ELIF_REGEX + ".*(\r|\n)").matcher(contents);
		while (elifM.find()) {
			String group = elifM.group();
			int start = elifM.start();
			elifStart.add(start);
			elifs.add(group);
			elifExpr.add(group.replaceAll(ANTENNA_ELIF_REGEX + "\\s*", "").replaceAll("\\s*(\r|\n)", ""));
			sorted.put(start, group);
		}

		List<String> elses = new ArrayList<>();
		List<Integer> elseStart = new ArrayList<>();
		Matcher elseMatcher = Pattern.compile(ANTENNA_ELSE_REGEX + ".*(\r|\n)").matcher(contents);
		while (elseMatcher.find()) {
			String group = elseMatcher.group();
			elses.add(group);
			int start = elseMatcher.start();
			elseStart.add(start);
			sorted.put(start, group);
		}

		List<String> endifs = new ArrayList<>();
		List<Integer> endifStart = new ArrayList<>();
		Matcher endifM = Pattern.compile(ANTENNA_ENDIF_REGEX + ".*(\r|\n|$)").matcher(contents);
		while (endifM.find()) {
			String group = endifM.group();
			endifs.add(group);
			int start = endifM.start();
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
	public String getExpression(int startIndex) {
		String expression = EXPR;

		int index = startIndex;
		while (index >= 0) {
			String value = sortedExprs.get(index);
			if (value.contains("elif")) {
				expression = expression.replace(EXPR, "!(" + EXPR + ") && " + elifExpr.get(elifStart.indexOf(index)));
				index = previous.get(index);
			} else if (value.contains("else")) {
				expression = expression.replace(EXPR, "!(" + EXPR + ")");
				index = previous.get(index);
			} else if (value.contains("endif")) {
				throw new IllegalStateException();
			} else if (value.contains("if")) {
				expression = expression.replace(EXPR, ifExpr.get(ifStart.indexOf(index)));
				index = -1;
			} else {
				throw new IllegalStateException();
			}
		}
		return expression;
	}

	public Set<String> getSurroundingAntennaAnnotations(ElementPosition<? extends T> position) {
		Set<String> surrounding = new HashSet<>();

		for (Integer annotation : sortedExprs.headMap(position.getStartIndex()).keySet()) {
			if (next.containsKey(annotation) && next.get(annotation) > position.getEndIndex()) {
				surrounding.add(getExpression(annotation));
			}
		}
		return surrounding;
	}
}