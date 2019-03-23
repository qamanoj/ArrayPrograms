package com.corejava.Bubbleshort;

import java.util.Scanner;

public class Bbbl1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.next();
		char[] c=s.toCharArray();
		for (int i =1; i <=c.length-1; i++)
		{
			for (int j = 0; j <=c.length-1-i; j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for (int i = 0; i <=c.length-1; i++)
		{
			System.out.println(c[i]);
		}
	}
}
