package Repair;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;

public class RepairAnnotation extends TAnnotationImpl{
	private TVisibility oldVisibility;
	private TVisibility newVisibility;
	
	public RepairAnnotation(TVisibility oldVisibility, TVisibility newVisibility) {
		this.oldVisibility = oldVisibility;
		this.newVisibility = newVisibility;
		// TODO Auto-generated constructor stub
	}

	public TVisibility getOldVisibility() {
		return oldVisibility;
	}

	public TVisibility getNewVisibiliy(){
		return newVisibility;
	}
	
	

}
