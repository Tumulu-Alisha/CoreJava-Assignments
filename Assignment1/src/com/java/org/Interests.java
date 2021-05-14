package com.java.org;
import java.util.Scanner;

public class Interests {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Principal");
		double prin=sc.nextDouble();
		System.out.println("Enter the rate of interest");
		double rate=sc.nextDouble();
		System.out.println("Enter the time period");
		double time=sc.nextDouble();
		System.out.println("Enter number of times interest is compunded");
		double timeperiod=sc.nextDouble();
		double si= ((prin*rate*time)/100);
		double ci= prin*(Math.pow((1+rate/100),(time*timeperiod)))-prin;
		
		System.out.println("The Simple intrest is"+ si);
		System.out.println("The Compound intrest is"+ci);
		sc.close();
	}
}
