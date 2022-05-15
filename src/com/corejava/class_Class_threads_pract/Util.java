package com.corejava.class_Class_threads_pract;

public class Util {
public static void sleep(long millis) {
	try
	{
		Thread.sleep(millis);
	}catch (InterruptedException ex) {
		ex.printStackTrace();
	}
	
}
}
