package com.java.org;

import java.util.ArrayList;

public class Thread_Class {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(05);
		A.add(24);
		A.add(96);
		A.add(37);
		A.add(17);
		A.add(54);
		Thread n = new Thread(new Runnable() {
			@Override
			public void run() {
				
				A.stream().forEach(t -> System.out.println(t));
			}
		});
		n.run();
	}
}