package com.corejava.class_Class_threads_pract;

class V extends Thread {
	@Override
	public void run() {
		System.out.println("run begin");
		Util.sleep(10000);
		System.out.println("run ends");
	}
}

public class M26 {

	public static void main(String[] args) {
		System.out.println("main begin");
		V obj = new V();
		obj.start();
		Util.sleep(2000);
        obj.interrupt();		
		System.out.println("main ends");
	}
}
