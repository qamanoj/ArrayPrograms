package com.corejava.highandlowelementinary;

public class smallestelmt
{
	public static void main(String[] args) 
	{
		int array[]=new int[]{10,20,30,40};
		int se=array[0];
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]<se)
			{
				se=array[i];
			}
		}
		System.out.println(se);
	}

}
