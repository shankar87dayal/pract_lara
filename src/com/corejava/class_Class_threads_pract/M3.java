package com.corejava.class_Class_threads_pract;

class A extends Thread {
	@Override
	public void run() {
		for (int i = 2000; i < 3000; i++) {
			System.out.println("seconds loop..." + i);
		}
	}
}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 4000; i < 5000; i++) {
			System.out.println("thirds loop..." + i);
		}
	}
}

public class M3 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		for (int i = 1; i < 1000; i++) {
			System.out.println("first loop..." + i);
		}
	}
}
