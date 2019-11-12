package com.bridgelabz.functional;
public class pyramid
{  
	public static void main(String args[])
	{

		for(int i=5;i>0;i--)
		{
			for( int j=5;j>i-1;j--)
			{
				System.out.print(" ");
			}

			for(int r=0;r<i;r++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}	
	
		for(  int i=2;i<=5;i++)
		{
			for( int j=5;j>i;j--)
			{
				System.out.print("");
			}

			for(int r=0;r<i;r++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}







