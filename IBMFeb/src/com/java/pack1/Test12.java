package com.java.pack1;

public class Test12 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e1) {
			System.out.println(e1);
		}finally {
			System.out.println("First Block Done");
		}
		
		try {
			int d=a/b;
			System.out.println(d);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Second Handling Done");
		}
		
		
	}
}
