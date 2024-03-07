package com.java.pack1;

public class EligibleException extends Exception {

	public EligibleException(String str) {
		super(str);
	}	
}
class Test{
	void eligible(int age,int percentage) throws Exception {
		if (age<18 || percentage<60) {
			throw new EligibleException("Not Eligible for registration");
		}else {
			System.out.println("Eligible for the Registration");
		}
	}
	public static void main(String[] args) throws Exception {
		Test obj1 = new Test();
		try {
			obj1.eligible(17,70);
		}catch(EligibleException e) {
			System.out.println(e);
		}
		System.out.println("End of the Program");
		
	}
}
