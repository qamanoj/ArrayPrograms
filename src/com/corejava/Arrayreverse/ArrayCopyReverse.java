package com.corejava.Arrayreverse;

public class ArrayCopyReverse 
{
	public static void main(String[] args)
	{
		int a[]=new int []{1,2,3,4,5,6};
		int a1[]=new int[a.length];
		for (int i = 0; i <=a1.length-1; i++)
		{
			a1[i]=a[a.length-1-i];
		}
		for (int i = 0; i <=a1.length-1; i++)
		{
			System.out.println(a1[i]);
		}
	}
}
