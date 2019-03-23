package com.array.Array2ndHighest;

import java.util.Arrays;

public class Array2ndHighestNumber 
{
	public static void main(String[] args) 
	{
		int array[]={3,1,20,9,16};
		Arrays.sort(array);
		/*for(int nd:array)
		{
		System.out.println(nd);
		}*/
		System.out.println("all arrays");
		for (int i = 0; i <=array.length-1; i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("first highest array "+array[array.length-1]);
		System.out.println("second highest array "+array[array.length-2]);
	}
}
