package com.java.org;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		int b=i;	
		int a=0;
		int c=0;
		
		while(i!=0) {
			a=i%10;
			c=c+(a*a*a);
			i=i/10;		
		}
		if(c==b)
		{
			System.out.println("The given number is amstrong number");
			
		}
		else
		{
			System.out.println("The given number is  not amstrong number");
			
		}
		sc.close();
	}

}
