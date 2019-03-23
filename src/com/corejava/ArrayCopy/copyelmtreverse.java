package com.corejava.ArrayCopy;

public class copyelmtreverse 
{
	public static void main(String[] args) 
	{
		int array[]=new int[]{10,20,30,40};
		int array1[]=new int[array.length];	
		for(int i=0;i<=array.length-1;i++)
		{
			array1[i]=array[array.length-1-i];
		}
		for (int j = 0; j <= array1.length-1; j++) 
		{
			System.out.println(array1[j]);
		}
	}
}
