package com.java.org;
import java.util.Scanner;

public class CUI {
    static int count;
	 public static void main(String[] args) {		
	    Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=2;i++){
		System.out.println("Enter the username");
		String user=sc.nextLine();
		System.out.println("Enter the password ");
        String pass=sc.nextLine();
       
		if(user.equals("Groot")&& pass.equals("1234"))
		{
			System.out.println("Welcome");
			break;		
		}
		else
		{
        	 count++;       
		}
		
		}
		        if(count==3)
		          {
		                   System.out.println("Contact Admin");
		          }
		sc.close();
	 }
}


