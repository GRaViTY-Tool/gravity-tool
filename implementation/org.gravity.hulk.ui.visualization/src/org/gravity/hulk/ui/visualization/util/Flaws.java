package org.gravity.hulk.ui.visualization.util;

public enum Flaws {
	
	H_BLOB_ANTIPATTERN("HBlobAntiPattern"),
	H_GODCLASS_ANTIPATTERN("HGodClassAntiPattern"),
	H_CONTROLLERCLASS_SMELL("HControllerClassSmell"),
	H_INVOCATIONRELATION_METRIC("HInvocationRelationMetric"),
	H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC("HNumberOfIncommingInvocationsMetric"),
	H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC("HNumberOfOutgoingInvocationsMetric"),
	H_LARGE_CLASS_LOW_COHESION_SMELL("HLargeClassLowCohesionSmell"),
	H_LOW_COHESION_SMELL("HLowCohesionSmell"),
	H_LCOM5_METRIC("HLCOM5Metric"),
	H_LARGE_CLASS_SMELL("HLargeClassSmell"),
	H_NUMBER_OF_MEMBERS_METRIC("HNumberOfMembersMetric"),
	H_DATA_CLASS_SMELL("HDataClassSmell"),
	H_GETTER_SETTER_SMELLS("HGetterSetterSmell"),
	H_NACC_METRIC("HNACCMetric"),
	H_SWISS_ARMY_KNIFE_ANTIPATTERN("HSwissArmyKnifeAntiPattern"),
	H_MUCH_OVERLOADING_SMELL("HMuchOverloadingCodeSmell"),
	H_AVERAGE_OVERLOADING_METRIC("HAverageOverloadingInClassMetric"),
	H_SPAGHETTI_CODE_ANTIPATTERN("HSpaghettiCodeAntiPattern"),
	H_INTENSIVE_FIELD_USAGE_SMELL("HIntensiveFieldUsageCodeSmell"),
	H_AVERAGE_PARAMETERS_METRIC("HAverageParametersMetric"),
	H_NUMBER_OF_CHILD_METRIC("HNumberOfChildMetric"),
	H_DEPTH_OF_INHERITANCE_METRIC("HDepthOfInheritanceMetric"),
	H_LOCAL_ACCESS_RELATION_METRIC("HLocalAccessRelationMetric"),
	H_LOCAL_FIELD_ACCESSES_METRIC("HLocalFieldAccessesMetric"),
	H_LOCAL_METHOD_ACCESSES_METRIC("HLocalMethodAccessesMetric"),
	H_DATA_CLASS_ACCESSOR("HDataClassAccessor");
	
	final String string;
	
	private Flaws(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return string;
	}
}
