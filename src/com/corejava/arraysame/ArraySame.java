package com.corejava.arraysame;
public class ArraySame 
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,2,3,4};
		int a1[]=new int[]{1,2,3,4};
		int count=0;
		for (int i = 0; i <=a.length-1; i++)
		{
			if(a[i]==a1[i])
			{
				count++; 
			}
			else
			{
				break;
			}
		}
		if(count==a.length)
		{
			System.out.println("array are same");
		}
		else
		{
			System.out.println("array are different");
		}
	}
}
