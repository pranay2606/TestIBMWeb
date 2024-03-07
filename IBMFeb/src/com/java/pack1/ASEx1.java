package com.java.pack1;

public class ASEx1 {
	private void mPrivate() {
		System.out.println("Private Method");
	}
	void mDefault() {
		System.out.println("Default Method");
	}
	protected void mProtected() {
		System.out.println("Protected Method");
	}
	public void mPublic() {
		System.out.println("Public Method");
	}
}
class Test1{
	public static void main(String[] args) {
		ASEx1 obj1 = new ASEx1();
		//obj1.mPrivate();
		obj1.mDefault();
		obj1.mProtected();
		obj1.mPublic();
	}
}
