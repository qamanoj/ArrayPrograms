package com.corejava.Anagram;

public class Anagram 
{
	public static void sort(char[] array)
	{
		for(int i=1;i<=array.length-1;i++)
		{
			for(int j=1;j<=array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					char temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		char[] y=new char[]{'v','c','f','g'};
		char[] x=new char[]{'V','c','f','g'};
		int count=0;
		if(y.length==x.length)
		{
			sort(y);
			sort(x);
			for(int i=0;i<=x.length-1;i++)
			{
				System.out.println(x[i]+" "+y[i]);
				if(x[i]==y[i])
					count++;
			}
		}
		if(count==x.length)
		{
			System.out.println("anna");
		}
		else
			System.out.println("not anna");
	}

}
