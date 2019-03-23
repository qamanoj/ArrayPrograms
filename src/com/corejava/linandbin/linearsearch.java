package com.corejava.linandbin;
import java.util.*;
public class linearsearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");		
		int array[]=new int[]{10,20,30,40};
		int search=sc.nextInt();
		int count=0;
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]==search)
			{
				System.out.println(i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("not found");
		}
	}
}


