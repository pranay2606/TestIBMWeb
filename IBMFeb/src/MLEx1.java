
public class MLEx1 {
	void m1() {
		System.out.println("m1");
	}
}
class MLEx2 extends MLEx1{
	void m2() {
		System.out.println("m2");
	}
}
class MLEx3 extends MLEx2{
	void m3() {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		MLEx3 obj1 = new MLEx3();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}
