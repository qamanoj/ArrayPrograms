package com.removeduplicatearray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		
		char []a={'z','b','a','c','d','f','f'};
		
		Set set=new HashSet<>();
		
		for (int i = 0; i <=a.length-1; i++) 
		{
			if(!set.contains(a[i]))
			{
				set.add(a[i]);
			}
		}
		System.out.println(set);
	}
}
