package com.corejava.class_Class_threads_pract;
class Y extends Thread
{
	Y(){
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M30 {
	public static void main(String[] args) {
		System.out.println(1);
		Y obj = new Y();
		obj.start();
		System.out.println(2);
	}
}
