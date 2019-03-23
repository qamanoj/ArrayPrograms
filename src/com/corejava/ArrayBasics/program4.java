package com.corejava.ArrayBasics;

public class program4 
{
	static void arrayrev(int a[])
	{
		for (int i=0; i<=a.length-2; i=i+2) 
		{

			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for (int i = 0; i <=a.length-1; i++) 
		{
			System.out.println(a[i]);	
		}
	}
	public static void main(String[] args) 
	{
		int d[]=new int[]{10,20,30,40,50,60};
		arrayrev(d);
		
		System.out.println("***********************");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}
	
	}



