package com.java.org;
import java.util.Scanner;
public class Ranged_Armstrong {
	
	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		if (n<0)
			System.out.println("enter a valid number");
		else
			System.out.println("The list of Armstrong numbers are:");
		for (int i= 100;i<= n ; i++)
        {
                   int d = i;
                   int t = 0;
                   int sum = 0;
                   while (d>0)
                    {
                          t = d % 10;
                          sum = sum + (t*t*t);
                          d = d / 10;
                    }
                    if (i==sum)
                     {
                                System.out.println(i);
                     }
        }
		sc.close();
	}

}
