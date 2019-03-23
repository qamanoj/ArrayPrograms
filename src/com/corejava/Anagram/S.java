package com.corejava.Anagram;

import java.util.Scanner;

public class S 
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s1=scr.nextLine();
		char arr[]=s1.toCharArray();
		char c='a';
		int count=0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==c)
				{
					count++;
					c++;
					break;
				}
			}
		}
		if(count==26)
		{
			System.out.println("annagram");

		}
		else{
			System.out.println("not annagram");
		}

	}
}
