package com.corejava.Arrayreverse;

public class ReverseStringArray1 
{
	public static void main(String[] args) 
	{
		String name="hello how are you";
		String array[]=name.split(" ");
		for (int i = 0; i <=array.length/2-1; i++) 
		{
			String temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		for (int i = 0; i <=array.length-1; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}
}
