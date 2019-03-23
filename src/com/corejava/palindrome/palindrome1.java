package com.corejava.palindrome;

public class palindrome1
{
	public static void main(String[] args) 
	{
		char array[]=new char[]{'m','a','d','a','m'};
		int count=0;
		/*for(int i=0;i<=array.length/2-1;i++)
		{
			char temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}*/
		for (int i = 0; i <=array.length-1; i++)
		{	
			if(array[i]==array[array.length-1-i])
			{
				count++;		
			}
		}	
		if(count==array.length)
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("not p");
		}
	}
}
