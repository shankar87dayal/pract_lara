package com.corejava.class_Class_threads_pract;

public class M11 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getName());
	t1.setName("change the name");
	System.out.println(t1.getName());
}
}
