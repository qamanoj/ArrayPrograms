package com.corejava.duplicatearray;

public class DuplicateArray2 
{
	public static void main(String[] args) {
		
		//int []a={1,2,3,4,5,6,7,4,7,9};
		char []a={'z','b','a','c','d','f','f'};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("the duplicate element is :"+a[j]);
				}
			}
		}
	}
}
