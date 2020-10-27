package org.gravity.eclipse.java.spl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Deque;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.io.FileUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProjectSplDiscoverer<T> {

	private static final String IF = "#if";
	private static final String IFNDEF = "#ifndef";
	
	private static final String PARAM = "###PARAM###";
	private static final String TYPE = "###TYPE###";
	private static final String NAME = "###NAME###";

	private static final Logger LOGGER = Logger.getLogger(JavaProjectSplDiscoverer.class);

	private static final String REGEX_COMMENT_NON_ANTENNA = "(\\/\\/(?!\\s*#).*?(\\n|\\r))|(\\/\\*(?:[^*]|\\*(?!\\/))*\\*\\/)";
	private static final String REGEX_STRING_CONTENT = "(?!\\\\)\".*?(?!\\\\)\"";

	private static final String REGEX_CLASSIFIER = "(interface|enum|class)\\s*?" + NAME
			+ "\\s*(<.+?>)?(\\s(.|\\s)*?)?\\{";
	private static final String REGEX_ATTRIBUTE = "((\\w.*?\\s*<\\s*(.*?,)?\\s*" + TYPE + "\\s*(,.*?)?\\s*?(>)+)|("
			+ TYPE + "\\s*?(<.*>\\s*?)?)|(" + TYPE + "(\\s*?\\[\\s*?\\]\\s*?)+))\\s*?(.+,\\s*?)?" + NAME
			+ "((\\s*?)|(\\s*?\\s+.*))(\\[\\s*\\]\\s*)?(,|;|=)";
	private static final String REGEX_OPERATION = "\\s*?(<.*>)?\\s*?\\(\\s*?" + PARAM
			+ "\\s*?\\)\\s*?(throws(.|\\s)*?)?(\\{|;)";
	private static final String REGEX_PARAMETER = "(@.+?(\\(.*?\\))?)?\\s*(final)?\\s*(\\s*\\w*\\s*\\.)*\\s*(((\\S*?<\\s*?)?"
			+ TYPE + "\\s*?(>\\s*?)?)|(" + TYPE + "\\s*<\\s*\\S*\\s*>))(\\[.*\\])?\\s*?" + NAME
			+ "\\s*?(\\[.*\\])?\\s*?,\\s*?" + PARAM;

	private List<Integer> open = new ArrayList<>();
	private List<Integer> close = new ArrayList<>();

	private final AntennaExpressionHandler<T> expressionHandler;
	private final String contents;

	public JavaProjectSplDiscoverer(InputStream contents, String id) throws IOException {
		String contentString = FileUtils.getContentsAsString(contents);

		this.contents = contentString.replace(IFNDEF, IF + " ! ").replaceAll(REGEX_COMMENT_NON_ANTENNA, "")
				.replaceAll(REGEX_STRING_CONTENT, "\"\"");

		expressionHandler = new AntennaExpressionHandler<>(this.contents);

		createListsOfOpeningAndClosingBraces(id);
	}

	private void createListsOfOpeningAndClosingBraces(String id) {
		int numOpenedBraces = 0;
		int numClosedBraces = 0;
		Deque<Integer> current = new LinkedList<>();
		for (int i = 0; i < this.contents.length(); i++) {
			char c = this.contents.charAt(i);
			if (c == '{' || c == '\u007B') {
				numOpenedBraces++;
				current.push(open.size());
				open.add(i);
				close.add(-1);
			} else if (c == '}' || c == '\u007D') {
				numClosedBraces++;
				if (current.isEmpty()) {
					LOGGER.log(Level.ERROR, "No opening { for closing } in " + id);
				}
				close.set(current.pop(), i);
			}
		}
		if (numOpenedBraces != numClosedBraces) {
			throw new IllegalStateException("The number of opened and closed braces is not equal!");
		}
	}

	public ElementPosition<T> getClassifierPosition(String name, T classifier) {
		int classifierNameIndex = -1;
		int classEndIndex = -1;
		Matcher classifierMatcher = Pattern.compile(REGEX_CLASSIFIER.replace(NAME, name)).matcher(contents);
		while (classifierMatcher.find()) {
			if (classifierNameIndex != -1) {
				throw new IllegalStateException();
			}
			classifierNameIndex = classifierMatcher.start();
			classEndIndex = close.get(open.indexOf(classifierMatcher.end() - 1));
		}
		if (classifierNameIndex == -1 || classEndIndex == -1) {
			return null;
		}
		return new ElementPosition<>(classifier, name, classifierNameIndex, classEndIndex);
	}

	public Collection<ElementPosition<T>> getOperationPosition(String operationName, List<String> paramNames,
			List<String> paramTypes, String returnType, T operation) {
		String methodRegex = returnType + "(\\[\\s*\\]|<.+>)?\\s+" + operationName + REGEX_OPERATION;
		for (int i = 0; i < paramNames.size(); i++) {
			String paramName = paramNames.get(i);
			String paramType = paramTypes.get(i).replaceAll("\\?", "\\\\?");
			int dot = paramType.lastIndexOf('.');
			if (dot > -1) {
				paramType = paramType.substring(dot + 1);
			}
			if (paramName != null && paramType != null) {
				String paramRegex = REGEX_PARAMETER.replace(TYPE, paramType).replace(NAME, paramName);
				methodRegex = methodRegex.replace(PARAM, paramRegex);
			}
		}

		methodRegex = methodRegex.replace(",\\s*?" + PARAM, "").replace(PARAM, "");

		LinkedList<ElementPosition<T>> positions = new LinkedList<>();
		Matcher methodMatcher = Pattern.compile(methodRegex).matcher(contents);
		while (methodMatcher.find()) {
			int startIndex = methodMatcher.start();
			String group = methodMatcher.group();
			int endIndex;
			if (group.endsWith(";")) {
				endIndex = methodMatcher.end() - 1;
			} else {
				int lastIndexOf = open.lastIndexOf(methodMatcher.end() - 1);
				if (0 <= lastIndexOf && lastIndexOf < close.size()) {
					endIndex = close.get(lastIndexOf);
				} else {
					throw new IllegalStateException();
				}
			}
			positions.add(new ElementPosition<T>(operation, operationName, startIndex, endIndex));
		}
		return positions;
	}

	public Collection<ElementPosition<T>> getAttributePosition(String attributeName, String typeName, T attribute) {
		String regex;
		if (typeName != null) {
			regex = REGEX_ATTRIBUTE.replace(TYPE, typeName);
		} else {
			regex = REGEX_ATTRIBUTE.replace(TYPE, "");
		}
		regex = regex.replace(NAME, attributeName);

		LinkedList<ElementPosition<T>> positions = new LinkedList<>();
		Matcher matcher = Pattern.compile(regex).matcher(contents);
		while (matcher.find()) {
			positions.add(new ElementPosition<T>(attribute, attributeName, matcher.start(), matcher.end()));
		}
		return positions;
	}

	/**
	 * A getter for the contents of the file
	 * 
	 * @return The file content as string
	 */
	public String getContents() {
		return contents;
	}

	public Set<String> getSurroundingAntennaAnnotations(ElementPosition<T> classifierPosition) {
		return expressionHandler.getSurroundingAntennaAnnotations(classifierPosition);
	}
}
