package com.corejava.class_Class_threads_pract;
class J extends Thread
{
	@Override
	public void run() {
//		Thread t1 = Thread.currentThread();
//		System.out.println(t1.getName());
//		System.out.println(t1.isDaemon());
//		System.out.println(t1.getPriority());
//		System.out.println(t1.getId());
		
//		 the same output up and down code.
		
		System.out.println(getName());
		System.out.println(isDaemon());
		System.out.println(getPriority());
		System.out.println(getId());
	}
}
public class M10 {
public static void main(String[] args) {
	J ref = new J();
	ref.start();
}
}
