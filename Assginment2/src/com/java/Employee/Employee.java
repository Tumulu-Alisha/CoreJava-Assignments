package com.java.Employee;

public class Employee {
	    int amount; 
		public Employee(int amount)
		{
			this.amount= amount;
		}
		 
		public void salary() 
		{
			System.out.println("The salary is :" + amount);
		}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(10000);
		e1.salary();
		Manager m1= new Manager(10000,1000);
		m1.salary();
		Labour l1= new Labour(8000,500,1);
		l1.salary();
	}

}
