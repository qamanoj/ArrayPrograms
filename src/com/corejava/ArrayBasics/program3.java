package com.corejava.ArrayBasics;

public class program3 
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,2,3,4,5,6};

		System.out.println(a.length);
		System.out.println("**********");

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("******");
		for(int s:a)
		{
			System.out.println(s);
		}
	}
}

