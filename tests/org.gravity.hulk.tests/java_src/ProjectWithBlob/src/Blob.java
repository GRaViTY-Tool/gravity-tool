
public class Blob {


	public static void main(final String[] args) {
		new Blob().method();
	}

	private final DataClass1 d11;
	private final DataClass2 d21;
	private final DataClass2 d22;

	public Blob() {
		this.d11 = new DataClass1();
		this.d21 = new DataClass2();
		this.d22 = new DataClass2();
	}

	private void method() {
		access11();
		access21();
		access22();
	}

	private void access22() {
		this.d11.setField(this.d11.getField());
	}

	private void access21() {
		this.d21.setField(this.d21.getField());
	}

	private void access11() {
		this.d22.setField(this.d22.getField());
	}
}
