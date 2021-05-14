package com.java.org;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int[] S1= new int[3];
		int[] S2= new int[3];
		int[] S3= new int[3];
		System.out.println("Enter the Marks of first student");
		for(int i=0;i<3;i++)
		{
			S1[i]=sc.nextInt();
			a=S1[i]+a;
		}
		System.out.println("Total marks of first student is"+a);
		System.out.println("Averge mark of first student is"+ (a/3));
		System.out.println("Enter the Marks of 2nd student");
		for(int i=0;i<3;i++)
		{
			S2[i]=sc.nextInt();
			b=S2[i]+b;
		}
		System.out.println("Total marks of second student is"+b);
		System.out.println("Averge mark of second student is"+ (b/3));
		System.out.println("Enter the Marks of 3nd student");
		for(int i=0;i<3;i++)
		{
			S3[i]=sc.nextInt();
			c=S3[i]+c;
		}
		System.out.println("Total marks of third student is"+c);
		System.out.println("Averge mark of third student is"+ (c/3));
		
		int total1=S1[0]+S2[0]+S3[0];
		System.out.println("The total marks in sub S1 is "+total1);
		System.out.println("The average maks in sub S1 is "+(total1/3));
		
		int total2=S1[1]+S2[1]+S3[1];
		System.out.println("The total marks in sub S2 is "+total2);
		System.out.println("The average maks in sub S2  is "+(total2/3));
		
		int total3=S1[2]+S2[2]+S3[2];
		System.out.println("The total marks in sub S3 is "+total3);
		System.out.println("The average maks in sub S3  is "+(total3/3));	
		sc.close();
	}
	
}
