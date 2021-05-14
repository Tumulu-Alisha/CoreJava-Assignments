package com.java.org;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1st number");
		int a = sc.nextInt();
		System.out.println("2nd number");
		int b = sc.nextInt();

		Sum add = (c, d) -> c + d;
        System.out.println(" addition=" + add.operation(a, b));
        
        Sum sub = (c, d) -> c - d;
		System.out.println(" subsraction=" + sub.operation(a, b));

		Sum mul = (c, d) -> c * d;
		System.out.println(" multiplication=" + mul.operation(a, b));

		Sum div = (c, d) -> c / d;
		System.out.println(" division=" + div.operation(a, b));
		sc.close();
	}
}

interface Sum {
	float operation(int a, int b);

}