package org.gravity.goblin.repair;

import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;

public class RepairAnnotation extends TAnnotationImpl {
	private TVisibility oldVisibility;
	private TVisibility newVisibility;

	public RepairAnnotation(TVisibility oldVisibility, TVisibility newVisibility) {
		this.oldVisibility = oldVisibility;
		this.newVisibility = newVisibility;
	}

	public TVisibility getOldVisibility() {
		return oldVisibility;
	}

	public TVisibility getNewVisibiliy() {
		return newVisibility;
	}

}
