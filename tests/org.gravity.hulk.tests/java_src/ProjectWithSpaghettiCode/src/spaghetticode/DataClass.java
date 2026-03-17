package spaghetticode;

public class DataClass {

	public static final String COMPOSITE = "composite";
	public static final String LEAF = "leaf";
	
	public static boolean isComposite(String type) {
		return COMPOSITE.equals(type);
	}
	
	public static boolean isLeaf(String type) {
		return LEAF.equals(type);
	}
}