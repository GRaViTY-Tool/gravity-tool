package MoDiscoTGG.org.moflon.tie.delta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class IndexedModel<T extends EObject> {

	private T model;
	private Map<Class<?>, List<EObject>> indices = new HashMap<>();
	private Predicate<Object> filter;

	public IndexedModel(T model, Predicate<Object> filter, Class<?>... interest) {
		this.model = model;
		this.filter = filter;
		for (Class<?> clazz : interest) {
			indices.put(clazz, new ArrayList<>());
		}
		EcoreUtil.getAllContents(model, false).forEachRemaining(content -> {
			if (!(content instanceof EObject) || !filter.test(content))
				return;
			for (Class<?> clazz : interest) {
				if (clazz.isAssignableFrom(content.getClass())) {
					indices.get(clazz).add((EObject) content);
				}
			}
		});
	}

	public T getModel() {
		return model;
	}

	public int size(Class<?> interest) {
		List<EObject> list = indices.get(interest);
		if (list == null)
			return 0;
		return list.size();
	}

	@SuppressWarnings("unchecked")
	public <U> U get(Class<U> interest, int index) {
		return (U) indices.get(interest).get(index);
	}

	/* package */ void addAll(EObject... eObjects) {
		Arrays.stream(eObjects).forEach(this::add);
	}

	/* package */ void add(EObject o) {
		if (!filter.test(o)) return;
		for (Entry<Class<?>, List<EObject>> entry : indices.entrySet()) {
			if (entry.getKey().isAssignableFrom(o.getClass())) {
				entry.getValue().add(o);
			}
		}
	}
}
