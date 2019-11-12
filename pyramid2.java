package com.bridgelabz.functional;
public class pyramid2
{  
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++)
		{
			for( int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
				
			for(int r=1;r<=(i*2)-1;r++)
			{
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
		
		
   }
}




