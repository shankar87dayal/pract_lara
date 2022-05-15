package com.corejava.class_Class_threads_pract;

public class M13 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
//		t1.setPriority(t1.NORM_PRIORITY);
//		t1.setPriority(0); // give an error
		System.out.println(t1.getPriority());
	}
}

/*


Thread.MIN_PRIORITY  =1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

*/

