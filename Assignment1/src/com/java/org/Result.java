package com.java.org;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Marks of First subject:");
		int S1=sc.nextInt();
		System.out.println("Enter the Marks of Second subject:");
		int S2=sc.nextInt();
		System.out.println("Enter the Marks of Third subject:");
		int S3=sc.nextInt();
		if(S1>60&&S2>60&&S3>60)
		{	
			System.out.println("The student has passed the test");	
		}
		else if ((S1>60 && S2>60 && S3<60)||(S1>60 && S2<60 && S3>60)||(S1<60 && S2>60 && S3>60))
		{			
			System.out.println("The student has been promoted");	
		}
		else 
		{
			System.out.println("The student has been failed");	
		}
		sc.close();
	}
}
