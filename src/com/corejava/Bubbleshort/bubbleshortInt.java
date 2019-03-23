package com.corejava.Bubbleshort;

public class bubbleshortInt
{
	public static void main(String[] args) 
	{
	 int array[]=new int[]{4,3,5,2,1,7};
	 
	 for(int i=1;i<=array.length-1;i++)
	 {
		 for(int j=0;j<=array.length-1-i;j++)
		 {
			if(array[j]>array[j+1])
			{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		 }
	 }
	 for(int i=0;i<=array.length-1;i++)
	 {
	System.out.println(array[i]);
	 }
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
	
