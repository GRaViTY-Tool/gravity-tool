package org.gravity.modisco;

import org.eclipse.osgi.util.NLS;

/**
 * Strings used in messages
 *
 * @author speldszus
 *
 */
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.gravity.modisco.messages"; //$NON-NLS-1$
	public static String infoCreateElementForFlow;
	public static String errorAccessToUnresolvedField;
	public static String errorClassAlreadyHasSuperType;
	public static String errorClassInstanceCreationNoType;
	public static String errorClassNoProxy;
	public static String errorEmptyMethodInvoc;
	public static String errorFindStaticType;
	public static String errorResolveStaticTypeOfAccessedUnresolved;
	public static String errorStaticTypeFailed;
	public static String errorFieldNoType;
	public static String errorFieldNoFragments;
	public static String errorTypeNoVisibility;
	public static String errorUnhandeldedCrossref;
	public static String errorUnhandled;
	public static String warnFieldMultipleFragments;
	public static String warnFieldNoTypeAssumeObject;
	public static String warnGuessMightBeOptimized;
	public static String warnGuessMightBeOptimizedDetailed;
	public static String warnReplacedInterfaceWithClass;
	public static String infoInsertFlowEdges;
	public static String infoReplacedClassWithInterface;
	public static String preprocessingOfUnknown;
	public static String returnTypeIsNull;
	public static String returnTypeNotSetAssumeObject;
	public static String infoSetDefaultFlowTarget;
	public static String skippedReturnType;
	public static String skippedType;
	public static String skippedUnresolvedMethod;
	public static String infoStatementPreprocessing;
	public static String unhandeledExpression;
	public static String unknownContainerAnon;
	public static String unknownDeclaringType;
	public static String unknownInvocationType;
	public static String unknownMethodDef;
	public static String unknownType;
	public static String unknownVarDecl;
	public static String unsupportedExpression;
	public static String unsupportedStaticTypeFromExpressionKind;
	public static String unsupportedSuperConstructorInvocation;
	public static String varHasntBeenReduced;
	public static String variableIsNull;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This class shouldn't be instantiated
	}
}
