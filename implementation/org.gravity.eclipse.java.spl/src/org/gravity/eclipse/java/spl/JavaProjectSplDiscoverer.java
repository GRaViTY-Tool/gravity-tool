package org.gravity.eclipse.java.spl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.gravity.eclipse.io.FileUtils;

public class JavaProjectSplDiscoverer<T> {

    public static final String REGEX_VARIABLE_NAME = "(\\w|\\d|\\$|\\_)+?";
    private static final String REGEX_JAVA_ANNOTATION = "(@.+?(\\(.*?\\))?)?";
    private static final String IF = "#if";
    private static final String IFNDEF = "#ifndef";

    private static final String PARAM = "###PARAM###";
    private static final String TYPE = "###TYPE###";
    private static final String NAME = "###NAME###";

    private static final Pattern REGEX_STRING_CONTENT = Pattern.compile("(?!\\\\)\".*?(?!\\\\)\"");

    private static final String REGEX_CLASSIFIER = "(interface|enum|class)\\s*?" + NAME
            + "\\s*(<.+?>)?(\\s(.|\\s)*?)?\\{";
    private static final String REGEX_ATTRIBUTE = "((\\w.*?\\s*<\\s*(.*?,)?\\s*" + TYPE + "\\s*(,.*?)?\\s*?(>)+)|("
            + TYPE + "\\s*?(<.*>\\s*?)?)|(" + TYPE + "(\\s*?\\[\\s*?\\]\\s*?)+))\\s*?(" + REGEX_VARIABLE_NAME
            + ",\\s*?)*?" + NAME + "((\\s*?)|(\\s*?\\s+.*))(\\[\\s*\\]\\s*)*?(,|;|=)";
    private static final String REGEX_OPERATION = "\\s*?(<.*>)?\\s*?\\(\\s*?" + PARAM
            + "\\s*?\\)\\s*?(throws(.|\\s)*?)?(\\{|;)";
    private static final String REGEX_COLLECTION_TYPE = "((\\S*?<\\s*?)" + TYPE + "\\s*?(>\\s*?))";
    private static final String REGEX_PARAMETER_ARRAY = REGEX_JAVA_ANNOTATION + "\\s*(final)?\\s*"
            + "(\\s*\\w*\\s*\\.)*\\s*" + "(" + "(" + "(" + REGEX_COLLECTION_TYPE + "|" + "(" + TYPE
            + "\\s*(<(\\S|\\s)*?>)?\\s*(\\[\\s*\\])+?)" + ")" + "\\s*?" + NAME + ")" + "|" + "(" + TYPE
            + "\\s*(<(\\S|\\s)*?>)?\\s*" + NAME + "\\s*?(\\[\\s*?\\])+?" + ")" + ")";
    private static final String REGEX_PARAMETER_SINGLE = REGEX_JAVA_ANNOTATION + "\\s*(final)?\\s*"
            + "(\\s*\\w*\\s*\\.)*\\s*" + "(" + TYPE + "\\s*(\\.\\.\\.)?(\\s*<(\\S|\\s)*?>)?)\\s*?" + NAME;

    private final List<Integer> open = new ArrayList<>();
    private final List<Integer> close = new ArrayList<>();

    private final FeatureAnnotationParser<T> antennaParser;
    private final FeatureAnnotationParser<T> hansParser;
    private final List<FeatureAnnotationParser<T>> annotationParsers;
    private final String contents;

    public JavaProjectSplDiscoverer(final InputStream contents, final String id) throws IOException {
        String contentString = FileUtils.getContentsAsString(contents);

        System.out.println("\n" + id);
        contentString = contentString.replace(IFNDEF, IF + " ! ");
        System.out.println("-> replaced #ifndef");
        contentString = REGEX_STRING_CONTENT.matcher(contentString).replaceAll("\"\"");
        System.out.println("-> Replaced strings");

        // Keep feature-annotation markers while masking ordinary comments. The
        // masking is length preserving, so source positions remain stable.
        contentString = FeatureAnnotationCommentSanitizer.sanitize(contentString);
        System.out.println("-> Replaced non-feature comments");

        this.contents = contentString;
        this.antennaParser = new AntennaFeatureAnnotationParser<>(this.contents);
        this.hansParser = new HansFeatureAnnotationParser<>(this.contents);
        this.annotationParsers = List.of(this.antennaParser, this.hansParser);

        if (hasFeatureAnnotations()) {
            createListsOfOpeningAndClosingBraces(id);
        }
    }

    private void createListsOfOpeningAndClosingBraces(final String id) {
        int numOpenedBraces = 0;
        int numClosedBraces = 0;
        final Deque<Integer> current = new LinkedList<>();
        for (int i = 0; i < this.contents.length(); i++) {
            final char c = this.contents.charAt(i);
            if ((c == '{') || (c == '\u007B')) {
                numOpenedBraces++;
                current.push(this.open.size());
                this.open.add(i);
                this.close.add(-1);
            } else if ((c == '}') || (c == '\u007D')) {
                numClosedBraces++;
                if (current.isEmpty()) {
                    int start = i - 30;
                    if (start < 0) {
                        start = 0;
                    }
                    int end = i + 30;
                    if (end > this.contents.length()) {
                        end = this.contents.length();
                    }
                    throw new IllegalStateException("No opening { for closing } in " + id + " at \""
                            + this.contents.substring(start, end) + "\"");
                }
                this.close.set(current.pop(), i);
            }
        }
        if (numOpenedBraces != numClosedBraces) {
            throw new IllegalStateException("The number of opened and closed braces is not equal!");
        }
    }

    public ElementPosition<T> getClassifierPosition(final String name, final T classifier) {
        int classifierNameIndex = -1;
        int classEndIndex = -1;
        final Matcher classifierMatcher = Pattern.compile(REGEX_CLASSIFIER.replace(NAME, name)).matcher(this.contents);
        while (classifierMatcher.find()) {
            if (classifierNameIndex != -1) {
                throw new IllegalStateException();
            }
            classifierNameIndex = classifierMatcher.start();
            classEndIndex = this.close.get(this.open.indexOf(classifierMatcher.end() - 1));
        }
        if ((classifierNameIndex == -1) || (classEndIndex == -1)) {
            return null;
        }
        return new ElementPosition<>(classifier, name, classifierNameIndex, classEndIndex);
    }

    public Collection<ElementPosition<T>> getOperationPosition(final String operationName,
            final List<String> paramNames, final List<String> paramTypes, final List<Boolean> paramsAreArrays,
            final String returnType, final T operation) {
        final LinkedList<ElementPosition<T>> positions = new LinkedList<>();
        final String expression = "\\s+" + operationName
                + "\\s*?(<.*?>)?\\s*?\\(((\\w|\\d|,|\\.|\\_|\\$|\\[|\\]|<|\\?|>|\\s|\\n)*?)\\)\\s*?(throws(\\w|\\d|,|\\.|\\_|\\$|\\s|\\n)*?)?";
        Pattern pattern;
        if (returnType == null) {
            pattern = Pattern.compile(expression + "\\{");
        } else {
            pattern = Pattern.compile(returnType + "\\s*?(<.*?>)?\\s*" + expression + "(\\{|;)");
        }
        final String param = buildParamRegex(paramNames, paramTypes, paramsAreArrays);
        final Pattern paramPattern = Pattern.compile("\\(\\s*" + param + "\\s*?\\)");
        final Matcher methodMatcher = pattern.matcher(this.contents);
        while (methodMatcher.find()) {
            final String paramGroup = methodMatcher.group();
            if (paramPattern.matcher(paramGroup).find()) {
                final int startIndex = methodMatcher.start();
                final String group = methodMatcher.group();
                final int endIndex;
                if (group.endsWith(";")) {
                    endIndex = methodMatcher.end() - 1;
                } else {
                    final int lastIndexOf = this.open.lastIndexOf(methodMatcher.end() - 1);
                    if ((0 <= lastIndexOf) && (lastIndexOf < this.close.size())) {
                        endIndex = this.close.get(lastIndexOf);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                positions.add(new ElementPosition<>(operation, operationName, startIndex, endIndex));
            }
        }
        return positions;
    }

    private String buildParamRegex(final List<String> paramNames, final List<String> paramTypes,
            final List<Boolean> paramsAreArrays) {
        if (paramNames.isEmpty() && paramTypes.isEmpty() && paramsAreArrays.isEmpty()) {
            return "";
        }
        final StringBuilder paramRegex = new StringBuilder();
        for (int i = 0; i < paramNames.size(); i++) {
            final String paramName = paramNames.get(i);
            String paramType = paramTypes.get(i).replace("?", "\\?");
            final int dot = paramType.lastIndexOf('.');
            if (dot > -1) {
                paramType = paramType.substring(dot + 1);
            }
            if ((paramName != null) && (paramType != null)) {
                if (i > 0) {
                    paramRegex.append(",\\s*?");
                }
                final String regex = paramsAreArrays.get(i) ? REGEX_PARAMETER_ARRAY : REGEX_PARAMETER_SINGLE;
                paramRegex.append(regex.replace(TYPE, "((\\w|\\d|,|\\_|\\$|)*(\\s|\\n)*\\.)*" + paramType)
                        .replace(NAME, paramName));
            }
        }
        paramRegex.append("\\s*?");
        return paramRegex.toString();
    }

    public Collection<ElementPosition<T>> getAttributePosition(final String attributeName, final String typeName,
            final T attribute) {
        String regex;
        if (typeName != null) {
            regex = REGEX_ATTRIBUTE.replace(TYPE, typeName);
        } else {
            regex = REGEX_ATTRIBUTE.replace(TYPE, "");
        }
        regex = regex.replace(NAME, attributeName);

        final LinkedList<ElementPosition<T>> positions = new LinkedList<>();
        final Matcher matcher = Pattern.compile(regex).matcher(this.contents);
        while (matcher.find()) {
            positions.add(new ElementPosition<>(attribute, attributeName, matcher.start(), matcher.end()));
        }
        return positions;
    }

    /**
     * @return sanitized source used for source-position matching
     */
    public String getContents() {
        return this.contents;
    }

    /**
     * @return the independent feature annotation parsers used by this discoverer
     */
    public List<FeatureAnnotationParser<T>> getAnnotationParsers() {
        return this.annotationParsers;
    }

    /** Gets annotations from all registered source annotation parsers. */
    public Set<String> getSurroundingFeatureAnnotations(final ElementPosition<? extends T> position) {
        final Set<String> result = new LinkedHashSet<>();
        for (final FeatureAnnotationParser<T> parser : this.annotationParsers) {
            result.addAll(parser.getSurroundingAnnotations(position));
        }
        return result;
    }

    /** Gets only HAnS feature annotations surrounding the program element. */
    public Set<String> getSurroundingHansAnnotations(final ElementPosition<? extends T> position) {
        return this.hansParser.getSurroundingAnnotations(position);
    }

    /** Gets only Antenna expressions surrounding the program element. */
    public Set<String> getSurroundingOnlyAntennaAnnotations(final ElementPosition<? extends T> position) {
        return this.antennaParser.getSurroundingAnnotations(position);
    }

    /**
     * Compatibility entry point used by the existing SPL conversion pipeline.
     * It returns the combined parser result so HAnS annotations reach existing
     * callers without requiring an immediate converter migration.
     *
     * @deprecated use {@link #getSurroundingFeatureAnnotations(ElementPosition)}
     */
    @Deprecated
    public Set<String> getSurroundingAntennaAnnotations(final ElementPosition<? extends T> position) {
        return getSurroundingFeatureAnnotations(position);
    }

    public boolean hasFeatureAnnotations() {
        return this.annotationParsers.stream().anyMatch(FeatureAnnotationParser::containsAnnotations);
    }

    public boolean hasHansAnnotations() {
        return this.hansParser.containsAnnotations();
    }

    public boolean containsAntennaAnnotations() {
        return this.antennaParser.containsAnnotations();
    }

    /**
     * @deprecated use {@link #hasFeatureAnnotations()}
     */
    @Deprecated
    public boolean hasAntennaAnnotations() {
        return hasFeatureAnnotations();
    }
}
