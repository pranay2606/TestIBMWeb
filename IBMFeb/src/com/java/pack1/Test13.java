package com.java.pack1;

public class Test13 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Test14 extends Thread{
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Test13 obj1 = new Test13();
		Test14 obj2 = new Test14();
		obj1.start();
		obj2.start();
	}
}