package com.corejava.class_Class_threads_pract;

public class M2 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			System.out.println("first loop..." + i);
		}
		for (int i = 2000; i < 3000; i++) {
			System.out.println("seconds loop..." + i);
		}
		for (int i = 4000; i < 5000; i++) {
			System.out.println("thirds loop..." + i);
		}
	}
}
