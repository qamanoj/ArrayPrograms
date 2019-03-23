package com.corejava.arraymissing;

public class MissingArray 
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,5,6,7,8,9};
		int sum=0;
		for (int i = 0; i <=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		//System.out.println(sum);
		int sum1=0;
		for(int j=0;j<=9;j++)
		{
			sum1=sum1+j;
		}
		//System.out.println(sum1);
		System.out.println("missing array is "+(sum1-sum));
	}
}
