package othercode;

import spaghetticode.DataClass;

public class Factory {

	public static Factory eINSTANCE = new Factory();

	public Component create(String type, String name) {
		Component component = null;
		if (isLeaf(type)) {
			component = createStringLeaf(name);
		} else if (isComposite(type)) {
			component = createComposite(name);
		}
		return component;
	}

	private Component createStringLeaf(String name) {
		Component component;
		component = new StringLeaf(name);
		return component;
	}

	private Component createComposite(String name) {
		Component component;
		component = new Composite();
		setName(component, name);
		return component;
	}

	private void setName(Component component, String name) {
		component.name = name;
	}
	
	public Component create(String type) {
		return isLeaf(type) ? createEmptyLeaf() : new Composite();
	}

	private boolean isLeaf(String type) {
		return type.equalsIgnoreCase(DataClass.LEAF);
	}

	private boolean isComposite(String type) {
		return type.equalsIgnoreCase(DataClass.COMPOSITE);
	}

	private ObjectLeaf createEmptyLeaf() {
		return new ObjectLeaf(null);
	}
}
