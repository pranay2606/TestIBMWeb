package com.java.pack1;

public class NestedEx {
	public static void main(String[] args) {
		String name="abcd";
		String password = "welcome";
		
		if (name=="abcd1") {
			if (password=="welcome") {
				System.out.println("Login Success");
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid Username");
		}
	}
}
