package com.corejava.Bubbleshort;

public class bubblesortchar
{
	public static void main(String[] args)
	{
		char array[]=new char[]{'a','x','u','p','c'};
		
		for(int i=1;i<=array.length-1;i++)
		{
			for(int j=0;j<=array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					char temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println(array[i]);
		}
	}
}
