package com.java.org;

import java.util.Arrays;

public class FirstLetter {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		Arrays.asList("Ananda","Anita","Alisha","Ayusha")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
		
	}

}
