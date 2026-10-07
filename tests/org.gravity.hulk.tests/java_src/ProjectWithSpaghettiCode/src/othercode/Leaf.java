package othercode;

public abstract class Leaf extends Component {

	@Override
	public String print() {
		return "Leaf: " + name;
	}
	
	abstract String print(String prefix);

}

class ObjectLeaf extends Leaf {

	private Object object;

	public ObjectLeaf(Object o) {
		this.object = o;
	}

	@Override
	String print(String prefix) {
		return prefix + print(object);
	}

	private String print(Object o) {
		return print(o.toString());
	}
	
}


class StringLeaf extends ObjectLeaf {

	public StringLeaf(String a) {
		super(a);
	}

	@Override
	String print(String prefix) {
		return prefix + print();
	}
		
}

class CharArrayLeaf extends StringLeaf {

	public CharArrayLeaf(char[] a) {
		super(new String(a));
	}

	@Override
	String print(String prefix) {
		return prefix + print();
	}
		
}