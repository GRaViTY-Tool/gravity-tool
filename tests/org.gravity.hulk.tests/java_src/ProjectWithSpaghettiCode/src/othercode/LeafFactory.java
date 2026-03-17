package othercode;

import java.util.ArrayList;
import java.util.List;

import spaghetticode.DataClass;

public class LeafFactory extends Factory {

	public static LeafFactory eINSTANCE = new LeafFactory();
	
	public Leaf create(String name) {
		return (Leaf) create(DataClass.LEAF, name);
	}
	
	public Composite create(String name, List<Component> children) {
		var composite = (Composite) create(DataClass.COMPOSITE, name);
		composite.children.addAll(children);
		return composite;
	}

	public Composite createComposite() {
		return new Composite();
	}

	public Leaf createLeaf(Composite root, String a) {
		Leaf leaf = new StringLeaf(a);
		return createLeaf(root, leaf);
	}

	public Leaf createLeaf(Composite root, Object o) {
		Leaf leaf = new ObjectLeaf(o);
		return createLeaf(root, leaf);
	}

	private Leaf createLeaf(Composite root, Leaf leaf) {
		root.children.add(leaf);
		return leaf;
	}


	public List<Composite> addChildComposites(int n) {
		var list = new ArrayList<Composite>();
		for(int i = 0; i < n; i++) {
			list.add(createComposite());
		}
		return list;
	}
}
