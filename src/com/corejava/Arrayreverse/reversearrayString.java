package com.corejava.Arrayreverse;

public class reversearrayString 
{
	public static void main(String[] args) 
	{
		String s[]=new String[]{"hello","how","are","you"};
		for (int i = 0; i <= s.length/2-1; i++) 
		{
			String temp=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=temp;
		}
		for (int i = 0; i <= s.length-1; i++) 
		{
			System.out.print(s[i]+" ");	
		}
	}
}
