package com.corejava.ArrayBasics;

public class program2 
{
	public static void main(String[] args)
	{
      int a[]=new int[5];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      a[4]=50;
      for(int i=0;i<=a.length-1;i++)
      {
    	  System.out.println(a[i]);
      }
      System.out.println("re-initialization");
      a[2]=20;
      a[3]=20;
      for(int i=0;i<=a.length-1;i++)
      {
    	  System.out.println(a[i]);
      }
      
	}
}
