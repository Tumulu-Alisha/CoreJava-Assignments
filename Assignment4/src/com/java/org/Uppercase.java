package com.java.org;

import java.util.ArrayList;

public class Uppercase {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Ganesha");
		n.add("Jagdish");
		n.add("Manmat");
		n.add("BalKrishna");
		n.add("Surya");
		n.add("Vivek");
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
