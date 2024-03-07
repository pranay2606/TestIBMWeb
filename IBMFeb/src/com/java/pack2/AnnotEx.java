package com.java.pack2;

public class AnnotEx {
	void m1() {
		System.out.println("M1 Method");
	}
}

class Ex2 extends AnnotEx{
	@Override
	void m1() {
		System.out.println("New M1 Method");
	}
}