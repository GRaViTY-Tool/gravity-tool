/**
 */
package org.gravity.refactorings.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.gravity.refactorings.impl.CreateSuperclass;
import org.gravity.refactorings.impl.ExtractClass;
import org.gravity.refactorings.impl.ExtractSuperclass;
import org.gravity.refactorings.impl.MoveField;
import org.gravity.refactorings.impl.MoveMember;
import org.gravity.refactorings.impl.MoveMethod;
import org.gravity.refactorings.impl.PullUpField;
import org.gravity.refactorings.impl.PullUpMethod;

public enum TRefactoringID {

	EXTRACT_CLASS(TRefactoringID.EXTRACT_CLASS_VALUE, TRefactoringID.EXTRACT_CLASS_NAME),
	MOVE_MEMBER(TRefactoringID.MOVE_MEMBER_VALUE, TRefactoringID.MOVE_MEMBER_NAME),
	MOVE_METHOD(TRefactoringID.MOVE_METHOD_VALUE, TRefactoringID.MOVE_METHOD_NAME),
	MOVE_FIELD(TRefactoringID.MOVE_FIELD_VALUE, TRefactoringID.MOVE_FIELD_NAME),
	PULLUP_METHOD(TRefactoringID.PULLUP_METHOD_VALUE, TRefactoringID.PULLUP_METHOD_NAME),
	PULLUP_FIELD(TRefactoringID.PULLUO_FIELD_VALUE, TRefactoringID.PULLUP_FIELD_NAME),
	CREATE_SUPERCLASS(TRefactoringID.CREATE_SUPERCLASS_VALUE, TRefactoringID.CREATE_SUPERCLASS_NAME),
	EXTRACT_SUPERCLASS(TRefactoringID.EXTRACT_SUPERCLASS_VALUE, TRefactoringID.EXTRACT_SUPERCLASS_NAME);

	public static final int EXTRACT_CLASS_VALUE = 0;
	public static final int MOVE_MEMBER_VALUE = 1;
	public static final int MOVE_METHOD_VALUE = 2;
	public static final int MOVE_FIELD_VALUE = 3;
	public static final int PULLUP_METHOD_VALUE = 4;
	public static final int PULLUO_FIELD_VALUE = 5;
	public static final int CREATE_SUPERCLASS_VALUE = 6;
	public static final int EXTRACT_SUPERCLASS_VALUE = 7;

	public static final String EXTRACT_CLASS_NAME = ExtractClass.class.getSimpleName();
	public static final String MOVE_MEMBER_NAME = MoveMember.class.getSimpleName();
	public static final String MOVE_METHOD_NAME = MoveMethod.class.getSimpleName();
	public static final String MOVE_FIELD_NAME = MoveField.class.getSimpleName();
	public static final String PULLUP_METHOD_NAME = PullUpMethod.class.getSimpleName();
	public static final String PULLUP_FIELD_NAME = PullUpField.class.getSimpleName();
	public static final String CREATE_SUPERCLASS_NAME = CreateSuperclass.class.getSimpleName();
	public static final String EXTRACT_SUPERCLASS_NAME = ExtractSuperclass.class.getSimpleName();

	private static final TRefactoringID[] VALUES_ARRAY = new TRefactoringID[] { EXTRACT_CLASS, MOVE_MEMBER, MOVE_METHOD,
			MOVE_FIELD, PULLUP_METHOD };

	public static final List<TRefactoringID> VALUES_LIST = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static TRefactoringID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final TRefactoringID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static TRefactoringID get(int value) {
		if (value == EXTRACT_CLASS_VALUE) {
			return EXTRACT_CLASS;
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
		return this.value;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
