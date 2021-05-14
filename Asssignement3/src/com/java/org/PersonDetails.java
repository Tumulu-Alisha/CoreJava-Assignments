package com.java.org;

import java.util.*;

public class PersonDetails implements Comparable<Object> {
	int Weight;
	int Height;
	String name;

	PersonDetails(int Weight, int Height, String name) {
		this.Height = Height;
		this.Weight = Weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [Weight=" + Weight + ", Height=" + Height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int Weight1 = this.Weight;
		int Height1 = this.Height;
		PersonDetails p = (PersonDetails) o;
		int Weight2 = p.Weight;
		int Height2 = p.Height;
		if (Weight1 < Weight2) {
			return -1;
		} else if (Weight1 > Weight2) 
			return +1;
		  else {
			
			if (Height1 < Height2) 
				return -1;
			
			 else if (Height1 > Height2) 
				return 1;
		}
		return Height2;

	}
}

class Sortmain {

	public static void main(String[] args) {
		PersonDetails p1 = new PersonDetails(50, 4, "Ram");
		PersonDetails p2 = new PersonDetails(56, 8, "Rehman");
		PersonDetails p3 = new PersonDetails(66, 9, "Rishab");
		PersonDetails p4 = new PersonDetails(66, 3, "Rita");
		PersonDetails p5 = new PersonDetails(55, 5, "Rose");

		TreeSet<PersonDetails> n = new TreeSet<>();
		n.add(p1);
		n.add(p2);
		n.add(p3);
		n.add(p4);
		n.add(p5);
		System.out.println(n);

	}
}