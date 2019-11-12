package com.bridgelabz.functional;

public class binarytodecimal 
{
	public static void main(String args[])
	{
		int a=11001;
		int r,dec=0,n=0;
		while(a>0)
		{
			r=a%10;
			dec=dec+r*(int)(Math.pow(2,n));
			n++;
			a=a/10;	
			
		}
		System.out.println(dec);
		
	}
	
	
	
}
                                  