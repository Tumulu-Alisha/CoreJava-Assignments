package com.java.org;

public class Bubble_Sort {
	public static void main(String[] args) {
	
		int S[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp=0;
		for(int i=0;i<S.length-1;i++)
		{
		    for(int j=0;j<S.length-1;j++)
		    {
		    	if(S[j]>S[j+1])
		    	{
		       temp=S[j];
		       S[j]=S[j+1];
		       S[j+1]=temp;
		    	}
		    }   
		}
		System.out.println("The sorted Array:");
		for(int i=0;i<S.length-1;i++)
		{
			System.out.println(S[i]);
		}
	}
}
