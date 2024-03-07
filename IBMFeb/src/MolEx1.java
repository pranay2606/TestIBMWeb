
public class MolEx1 {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void div(int a,int b) {
		System.out.println(a/b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void m1(int a,String b) {
		System.out.println(a+b);
	}
	void m1(String a,float b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MolEx1 obj1 = new MolEx1();
		obj1.add(10, 20);
		obj1.div(100, 20);
		obj1.add(10,20,10);
		obj1.m1(10, "welcome");
	}
}
