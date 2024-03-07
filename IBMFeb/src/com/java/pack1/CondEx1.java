package com.java.pack1;

public class CondEx1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if (a>b) {
			System.out.println("Greater");
		}else if(a<b) {
			System.out.println("Lesser");
		}else if (a==b) {
			System.out.println("Equals");
		}else {
			System.out.println("None of the Above");
		}
	}
}
