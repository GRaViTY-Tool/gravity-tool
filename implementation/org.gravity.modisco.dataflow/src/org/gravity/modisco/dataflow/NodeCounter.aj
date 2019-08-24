package org.gravity.modisco.dataflow;

public aspect NodeCounter {
	
	public static int counter = 0;

	pointcut handle():
		execution(* ExpressionHandlerDataFlow.handle(..)) || execution(* StatementHandlerDataFlow.handle(..)) || execution(* MiscHandlerDataFlow.handle(..));
	
	after():
		handle() {
		counter++;
	}

}
