
public class ConsEx {
	ConsEx() {
		System.out.println("Common Method");
	}
	void m1() {
		System.out.println("M1 Method");
	}
	void m2() {
		System.out.println("M2 Method");
	}
	public static void main(String[] args) {
		ConsEx obj1 = new ConsEx(); //constructor calling
		obj1.m1();
		obj1.m2();
	}
}
