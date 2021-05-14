package com.java.org;
import java.util.HashSet;
import java.util.Iterator;

public class Fail {

	public static void main(String[] args) {
		
		HashSet<Object> n= new HashSet<Object>();
		
		n.add("Amar");
		n.add("Akhbar");
		n.add(25);
		n.add(55);

		Iterator<Object> i=n.iterator();
		 while(i.hasNext())
		   {
			   Object a=i.next();
			   n.add("Anthony");
			   System.out.println(a);
		   }
	
}
	}
