package com.corejava.linandbin;
import java.util.Scanner;

public class binarysearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int array[]=new int[]{10,20,30,40,50,45};
		int search=sc.nextInt();
		int low=0;
		int high=array.length-1;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==search)
			{
				System.out.println(mid);
				count++;
				break;
			}
			if(array[mid]>search)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(count==0)
		{
			System.out.println("not found");
		}
	}

}
