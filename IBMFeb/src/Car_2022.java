
public class Car_2022 {
	void wheels() {
		System.out.println("Alloy Wheels");
	}
	void roof() {
		System.out.println("Sunroof");
	}
	void music() {
		System.out.println("7inch touch Music Player");
	}
}
class Car_2023 extends Car_2022{
	
	void roof() {
		//System.out.println("Panaromic Sunroof");
		super.roof();
	}
	void music() {
		System.out.println("10 inch touch Music Player");
	}
	public static void main(String[] args) {
		Car_2023 obj1 = new Car_2023();
		obj1.wheels();
		obj1.roof();
		obj1.music();
	}
}
