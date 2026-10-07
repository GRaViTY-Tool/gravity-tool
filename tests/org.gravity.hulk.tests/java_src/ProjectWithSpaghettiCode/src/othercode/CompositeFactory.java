package othercode;

public class CompositeFactory extends Factory {
	
	public static CompositeFactory eINSTANCE = new CompositeFactory();

	public Composite create(String name) {
		Composite composite = new Composite();
		return setName(composite, name);
	}

	private Composite setName(Composite composite, String name) {
		composite.setName(name);
		return composite;
	}
	
	public Composite create() {
		return new Composite();
	}
	
	public Composite addLeafs(Composite composite, String... names) {
		for(String name : names) {
			LeafFactory.eINSTANCE.createLeaf(composite, name);
		}
		return composite;
	}
	
	public Composite addComposites(Composite composite, String... names) {
		for(String name : names) {
			composite.addChild(create(name));
		}
		return composite;
	}
	
	public Composite addChild(Composite composite, Component child) {
		composite.addChild(child);
		return composite;
	}
}
