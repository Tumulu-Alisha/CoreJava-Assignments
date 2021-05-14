package com.java.Employee;

public class Manager extends Employee 
{
	int total;
	int incentive;
	
	public Manager(int amount, int incentive)
	{
		super(amount);
		this.incentive= incentive;
	}
	
	public void salary()
	{
		total=amount+incentive;
		System.out.println("The salary of manager is: " +total);
	}
}
