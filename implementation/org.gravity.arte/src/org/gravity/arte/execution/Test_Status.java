package org.gravity.arte.execution;


enum Test_Status {
	SUCCESS,
	WARNING,
	FAILURE;
	
	public boolean toBool(){
		if (this == SUCCESS)
			return true;
		if (this == WARNING)
			return true;
		if (this == FAILURE)
			return false;
		return false;
	}

	public Test_Status getApplicationOf(Test_Status input) {
		if (this == SUCCESS)
			return input;
		if (this == WARNING && input != SUCCESS)
			return input;
		if (this == FAILURE)
			return FAILURE;
		return FAILURE;
	}
}
