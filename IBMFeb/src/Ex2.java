
public class Ex2 {
	
}

abstract class AbsEx1{
	abstract void m1();
	void m2() {
		System.out.println("M2 Concrete Method");
	}
}

class NorEx1 extends AbsEx1{
	void m1() {
		System.out.println("m1 Converted Method");
	}
	public static void main(String[] args) {
		NorEx1 obj1 = new NorEx1();
		obj1.m1();
		obj1.m2();
	}
}
