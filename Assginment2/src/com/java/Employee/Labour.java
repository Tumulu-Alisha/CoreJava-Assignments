package com.java.Employee;

public class Labour extends Employee 
{
	int time;	
	public Labour(int amount,int bonus, int time){
		super(amount);
		this.time = time;
	}

	public void salary()
	{	
		System.out.println("The salary of a labour is: " +(amount+time));
	}
}
