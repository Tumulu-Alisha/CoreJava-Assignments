package com.java.org;
import java.util.Scanner;

public class Order_Result {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Amount");
		int p= sc.nextInt();
		
		if(p>10000)
		{
		 System.out.println("Order is accepted");
		}
		else
		{
			System.out.println("Order is denied");
		}
		sc.close();
	}
}

