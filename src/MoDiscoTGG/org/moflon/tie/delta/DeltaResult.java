package MoDiscoTGG.org.moflon.tie.delta;

import org.eclipse.emf.ecore.EObject;

public class DeltaResult {
	public static final DeltaResult EMPTY = new DeltaResult(0, new EObject[0]);

	private final int size;
	private final EObject[] entries;

	public DeltaResult(int size, EObject... entries) {
		this.size = size;
		this.entries = entries;
	}

	public int getSize() {
		return size;
	}

	public EObject[] getEntries() {
		return entries;
	}

}
