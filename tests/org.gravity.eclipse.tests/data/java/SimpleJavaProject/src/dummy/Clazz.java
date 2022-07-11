package dummy;

public class Clazz {

	private final Clazz field;

	private Clazz() {
		this.field = this;
	}

	public static void main(final String[] args) {
		new Clazz().getField();
	}

	private Clazz getField() {
		return this.field;
	}
	
	public class Inner {
		
	}
}