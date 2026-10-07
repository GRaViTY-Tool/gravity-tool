package othercode;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> children = new ArrayList<>();
	
	@Override
	public String print() {
		return "Composite: " + name + " with " + String.join(", ", children.stream().map(c -> c.print()).toList());
	}

	public void addChild(Component component) {
		children.add(component);
	}
	
	public void addChild(Component component, boolean reset) {
		children.clear();
		children.add(component);
	}
}
