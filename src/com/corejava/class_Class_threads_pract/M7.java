package com.corejava.class_Class_threads_pract;

class G extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

public class M7 {
	public static void main(String[] args) {
		G g2 = new G();
//		g2.start();
		g2.run();
		for (int i = 4000; i < 5000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
