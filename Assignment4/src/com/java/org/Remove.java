package com.java.org;
import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {	
	ArrayList<String>n=new ArrayList<String>();
	
	n.add("Umar");
	n.add("Devesh");
	n.add("Shilpi");
	n.add("Aryan");
	n.add("Ehtasam");
	n.add("Harshit");
	
	System.out.println(n);
	n.removeIf(t->(t.length()%2==1));
	System.out.println(n);
	}
}
