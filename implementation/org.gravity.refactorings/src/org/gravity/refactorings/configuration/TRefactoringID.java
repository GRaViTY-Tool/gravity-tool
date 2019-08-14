/**
 */
package org.gravity.refactorings.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum TRefactoringID {
	
	TExtractClass(TRefactoringID.TExtractClass_VALUE, TRefactoringID.TExtractClass_NAME),
	TMoveMember(TRefactoringID.TMoveMember_VALUE, TRefactoringID.TMoveMember_NAME),
	TMoveMethod(TRefactoringID.TMoveMethod_VALUE, TRefactoringID.TMoveMethod_NAME),
	TMoveField(TRefactoringID.TMoveField_VALUE, TRefactoringID.TMoveField_NAME),
	TPullUpMethod(TRefactoringID.TPullUpMethod_VALUE, TRefactoringID.TPullUpMethod_NAME), 
	TPullUpField(TRefactoringID.TPullUpField_VALUE, TRefactoringID.TPullUpField_NAME), 
	TCreateSuperClass(TRefactoringID.TCreateSuperClass_VALUE, TRefactoringID.TCreateSuperClass_NAME),
	TExtractSuperClass(TRefactoringID.TExtractSuperClass_VALUE, TRefactoringID.TExtractSuperClass_NAME);
	

	public static final int TExtractClass_VALUE = 0;
	public static final int TMoveMember_VALUE= 1;
	public static final int TMoveMethod_VALUE= 2;
	public static final int TMoveField_VALUE= 3;
	public static final int TPullUpMethod_VALUE= 4;
	public static final int TPullUpField_VALUE= 5;
	public static final int TCreateSuperClass_VALUE = 6;
	public static final int TExtractSuperClass_VALUE = 6;

	public static final String TExtractClass_NAME = "TExtractClass";
	public static final String TMoveMember_NAME= "TMoveMember";
	public static final String TMoveMethod_NAME= "TMoveMethod";
	public static final String TMoveField_NAME= "TMoveField";
	public static final String TPullUpMethod_NAME= "TPullUpMethod";
	public static final String TPullUpField_NAME= "TPullUpField";
	public static final String TCreateSuperClass_NAME = "TCreateSuperClass";
	public static final String TExtractSuperClass_NAME = "TExtractSuperClass";

	
	private static final TRefactoringID[] VALUES_ARRAY = new TRefactoringID[] {
			TExtractClass, TMoveMember, TMoveMethod, TMoveField, TPullUpMethod};

	public static final List<TRefactoringID> VALUES_LIST = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static TRefactoringID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRefactoringID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static TRefactoringID get(int value) {
		switch (value) {
		case TExtractClass_VALUE:
			return TExtractClass;
		}
		return null;
	}

	private final int value;
	private final String name;

	private TRefactoringID(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
