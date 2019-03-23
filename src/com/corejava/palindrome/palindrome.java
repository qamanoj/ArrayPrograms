package com.corejava.palindrome;

public class palindrome 
{
	public static void main(String[] args)
	{
		char array[]=new char[]{'m','a','d','a','m'};
		char array1[]=new char[array.length];
		int count=0;
		for(int i=0;i<=array.length-1;i++)
		{
			array1[i]=array[array.length-1-i];
		}
		for(int i=0;i<=array1.length-1;i++)
		{
			if(array1[i]==array[i])
			{		
				count++;	
			}
		}
		if(count==array.length)
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not a palindrome");
		}
	}
}


