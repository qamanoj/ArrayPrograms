package com.corejava.sumofarray;

public class SumOfAry
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,2,3,4,5,6};
		int s=0;
		for (int i = 0; i <=a.length-1; i++) 
		{
			s=s+a[i];
		}
		System.out.println(s);
	}
}
