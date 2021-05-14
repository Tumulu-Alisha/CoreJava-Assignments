package com.java.org;
import java.util.Scanner;

public class Income_Tax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the income range");
		int i=sc.nextInt();
		if(i>=0 && i<=180000)
		{
			System.out.println("Nil");	
		}
		else if (i>=180001 && i<=300000 )
		{
			System.out.println("The tax pay is 10% of the income.");		
		}
		else if(i>=300001 && i<=500000)
		{
			System.out.println("The tax pay is 20% of the income.");		
		}
		else if(i>=500001 && i<=1000000)
		{
			System.out.println("The tax pay is 30% of the income.");	
		}
		sc.close();
	}
}
