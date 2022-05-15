package com.corejava.class_Class_threads_pract;

public class M9 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());

	}
}
