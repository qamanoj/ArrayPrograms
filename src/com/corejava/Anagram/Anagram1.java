package com.corejava.Anagram;

import java.util.Arrays;

public class Anagram1 {
	
	public static void main(String[] args) {
		
		char[]a1={'a','j','v','a'};
		char[]a2={'j','a','a','v'};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println(a1);
		System.out.println(a2);
		if(Arrays.equals(a1, a2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
