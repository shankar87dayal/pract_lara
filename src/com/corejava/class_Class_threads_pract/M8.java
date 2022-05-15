package com.corejava.class_Class_threads_pract;

class H implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

public class M8 {
	public static void main(String[] args) {
		H h1 = new H();
		Thread t1 = new Thread(h1);
//		t1.start();
//		t1.run();
		h1.run();
		for (int i = 4000; i < 5000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
