
public class OuterClass {

	public void m(){
		new Object(){
			class InnerClass {
				
			}
		};
	}
}
