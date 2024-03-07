
public class Sample {
	void m1() {
		System.out.println("m1 method");
	}
}
class Test{
	void m2() {
		System.out.println("m2 Method");
	}
	public static void main(String[] args) {
		Test obj2 = new Test();
		Sample obj1 = new Sample();
		obj1.m1();
		obj2.m2();
	}
}
