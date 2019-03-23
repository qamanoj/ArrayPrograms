package com.corejava.ArrayBasics;

public class program 
{
	public static void main(String[] args) 
	{
		int[] array={1,2,3,4,5};
		System.out.println(array);
		System.out.println(array.getClass().getName());
		System.out.println(array.getClass().getCanonicalName());
		System.out.println(array.clone());
		System.out.println(array.getClass().isArray());
	}
}
