package com.bridgelabz.functional;
import java.util.*;
public class removeduplicate
{
	public static void main(String args[])
	{
		int n[]= {1,2,2,3,4,4,5};
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println( n[i]+ "");
				}
			}
		}
	}
}
		 

	