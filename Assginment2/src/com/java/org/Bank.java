package com.java.org;

public class Bank {
	int fixdeposit;
	int credit;
	int total = 20000;

	public static void main(String[] args) {

		saving s = new saving();
		current c = new current();
		s.totalcash(20000, 0);
		c.totalcash(0, 30000);

	}
}

class saving extends Bank {

	void totalcash(int fixdepo, int credit) {

		int t = total + fixdepo + credit;
		System.out.println("the saving account total cash: " + t);
	}
}

class current extends Bank{
        
        void totalcash(int fix_deposit,int credit)
        {
            int t= total+fix_deposit+credit;
            System.out.println("The current account total cash: "+t);
        }

}