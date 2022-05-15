package com.corejava.class_Class_threads_pract;

class U extends Thread {
	@Override
	public void run() {
		System.out.println("run begin");
		for (int i = 100; i <= 110; i++) {
			System.out.println(i);
			Util.sleep(5000);

		}
		System.out.println("run ends");
	}
}

public class M25 {

	public static void main(String[] args) {
		U obj = new U();
		obj.start();
		System.out.println("main begin");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Util.sleep(2000);

		}
		System.out.println("main ends");
	}
}
