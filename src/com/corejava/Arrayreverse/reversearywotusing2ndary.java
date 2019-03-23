package com.corejava.Arrayreverse;

public class reversearywotusing2ndary 
{
	public static void main(String[] args)
	{
		int array[]=new int[]{10,20,30,40,50,60};

		for(int i=0;i<=array.length/2-1;i++)
		{
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println(array[i]);
		}
	}
}





