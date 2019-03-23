package com.corejava.duplicatearray;
public class duplicateelmtary
{
	public static void main(String[] args)
	{
		int array[]=new int[]{10,20,20,30,40};

		for(int i=0;i<=array.length-1;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			int count1=1;
			if(count==0)
			{
				for(int k=i;k<=array.length-2;k++)
				{
					if(array[i]==array[k+1])
					{
						count1++;
					}
				}
				System.out.println(array[i]+"is present"+" "+count1+" tiems");
			}
		}

	}

}
