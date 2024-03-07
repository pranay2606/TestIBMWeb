
public class Parent {
	void car() {
		System.out.println("Car Model X");
	}
	void house() {
		System.out.println("Home g+2");
	}
}
class ch1 extends Parent{
	void m1() {
		System.out.println("m1");
	}
}
class ch2 extends Parent{
	void m2() {
		System.out.println("m2");
	}
}
class Final{
	public static void main(String[] args) {
		ch1 c1 = new ch1();
		ch2 c2 = new ch2();
		c2.m2();
		c2.car();
		c2.house();
	}
}
