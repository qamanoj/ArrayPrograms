package com.corejava.sumofarray;

public class sumofoddno 
{
	public static void main(String[] args) 
	{
      int array[]=new int[]{1,2,3,4,5,6};
      int sum=0;
      for(int i=0;i<=array.length-1;i++)
      {
    	  if(array[i]%2!=0)
    	  {
    		  sum=sum+array[i];
    	  }
      }
      System.out.println(sum);
	}
}
