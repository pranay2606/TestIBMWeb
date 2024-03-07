package com.java.pack1;

public class ExcepionEx1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("End of the Program");
	}
}
