package com.corejava.highandlowelementinary;

public class highestelmt 
{
	public static void main(String[] args) 
	{
		int array[]=new int[]{10,50,30,40};
		int he=array[0];
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]>he)
			{
				he=array[i];
			}
		}
		System.out.println(he);
	}
}
