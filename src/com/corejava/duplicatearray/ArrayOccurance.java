package com.corejava.duplicatearray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayOccurance 
{
	public static void main(String[] args) {
		char c[]={'s','a','a','h','o','o'};
		
		//int c[]={1,2,3,4,2,3,4,5,7};
		
		HashMap<Character, Integer> map=new HashMap<>();
		//System.out.println(map); o/p={}
		for(int i=0;i<=c.length-1;i++)
		{
			if(map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}
			else
			{
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
	}
}
