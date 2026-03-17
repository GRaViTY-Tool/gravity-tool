package program.one;

public class FinalClass46 extends FinalClass0 {

	public static void main(String[] args) {
		FinalClass46 c = new FinalClass46();
		c.m1();
	}
	
	public void m1(){
		System.out.println("FinalClass01");
	}
	
	public int m2(){
		int i = 1+2;
		return i;
	}

	public void m3(){
		for(int i = 0; i<100; i++){
			System.out.println("i="+i);
		}
	}

	public void m4(){
		System.out.println("abc");
	}

	public void m5(int i){
		if(i>0){
			System.out.println("Greater zero");
		}
		else{
			System.out.println("Smaller or equal zero");
		}
	}

	public void m6(){
		String s = "";
		while(s.length()<10){
			s+="a";
		}
	}

	public void m7(){
		System.out.println("a");
	}

	public void m8(){
		System.out.println("b");
	}
	
	public void m9(){
		System.out.println("c");
	}

	public void m10(){
		int a = 0;
		int b = 1;
		b+= a;
		a+=b;
	}

	public void m11(){
		System.out.println("Hello World");
	}

	public void m12(){
		m11();
	}

	public void m13(){
		m12();
	}

	public void m14(){
		m13();
		m1();
	}

	public void m15(){
		System.out.println("TTC");
	}
}
