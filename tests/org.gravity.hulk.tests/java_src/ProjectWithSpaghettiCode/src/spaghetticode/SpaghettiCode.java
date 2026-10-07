package spaghetticode;

import othercode.LeafFactory;

import java.util.ArrayList;
import java.util.List;

import othercode.Component;
import othercode.Composite;
import othercode.Factory;

public class SpaghettiCode {

	public Composite root;
	public List<Component> allElements  = new ArrayList<>();
	
	static final String ROOT_NAME = "ROOT";
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		SpaghettiCode main = new SpaghettiCode();
		main.run();
		System.out.println(main.root);
		for (var element : main.allElements) {
			System.out.println(element.name);
		}

	}

	private void run() {
		root = (Composite) Factory.eINSTANCE.create(DataClass.COMPOSITE, ROOT_NAME);
		allElements.add(Factory.eINSTANCE.create(DataClass.LEAF, "L"));
		allElements.add(LeafFactory.eINSTANCE.createLeaf(root, "A"));
		allElements.addAll(LeafFactory.eINSTANCE.addChildComposites(5));
		
		// Report
		System.out.println(root.print());
		System.out.println(allElements);
		allElements.forEach(System.out::println);
		for(var element : allElements) {
			if(ROOT_NAME.equals(element.name)) {
				System.out.println(element);
			}
		}

	}
}
