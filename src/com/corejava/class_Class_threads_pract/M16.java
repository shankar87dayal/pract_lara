package com.corejava.class_Class_threads_pract;

class M extends Thread
{
	M (String name){
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M16 {
public static void main(String[] args) {
	M m1 = new M("My first thread");
	m1.start();
	System.out.println(m1.getName());
	m1.setName("first child");
	System.out.println(m1.getName());
}
}
