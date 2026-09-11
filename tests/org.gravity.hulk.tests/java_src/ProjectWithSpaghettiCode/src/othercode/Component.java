package othercode;

public abstract class Component {

	public String name;
	
	public abstract String print();
	
	public void setName(String name) {
		this.name = name;
	}
}
