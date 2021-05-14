package com.java.org;
import java.util.ArrayList;
import java.util.ListIterator;

public class L_iterator {

	public static  void main(String[] args) {
		
		ArrayList<Object> n=new ArrayList<>();

		n.add("Ram");
		n.add("Rahem");
		n.add("Rishab");
		n.add("Rita");
		n.add("Rose");
		n.add("Rupsa");
		n.add(2);
		
		System.out.println(n);
		
		ListIterator<Object>  list= n.listIterator(n.size());
		while(list.hasPrevious())
		{
			Object s=list.previous();
			System.out.println(s);
		}
	}
}
