package com.corejava.duplicatearray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray 
{
	public static void main(String[] args) {
		
		//char array[]={'s','a','h','o','o'};
		int array[]={1,2,3,2,1,4,5,6};
		Set nondup=new HashSet<>();
		Set dup=new HashSet<>();
		
		for(int ch:array)
		{
			if(!nondup.contains(ch))
			{
				nondup.add(ch);
			}
			else
			{
				dup.add(ch);
			}
		}
		System.out.println(dup);
	}
}
