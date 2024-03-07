package com.java.pack1;

public class MTEx1 implements Runnable {
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
class MTEx2 implements Runnable{
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
	public static void main(String[] args) throws Exception {
		MTEx1 obj1 = new MTEx1();
		MTEx2 obj2 = new MTEx2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("End");
	}
}





