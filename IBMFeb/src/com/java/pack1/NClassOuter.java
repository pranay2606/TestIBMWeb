package com.java.pack1;

public class NClassOuter {
	private int a=10;
	void outerM() {
		System.out.println("Outer Method");
		//creating an object of inner class in outer class
		NClassOuter.NClassInner in = new NClassOuter().new NClassInner();
		in.innerM();
	}
	
	//Inner CLass Starting point
	class NClassInner{
		void innerM() {
			System.out.println(a);
		}
	}
	//Inner CLass Ending point
	public static void main(String[] args) {
		NClassOuter obj1 = new NClassOuter();
		obj1.outerM();
	}
}
