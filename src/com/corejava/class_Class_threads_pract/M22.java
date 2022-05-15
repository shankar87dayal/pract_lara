package com.corejava.class_Class_threads_pract;

public class M22 {
	public static void main(String[] args) {
		System.out.println("main begin");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}
