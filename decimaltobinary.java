package com.bridgelabz.functional;
import java.util.Scanner;
public class decimaltobinary
{
	public static void main(String args[])
	{
		String a= "";
		int n,r;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to be converted");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%2;
			a=r+ "" +a;
			n=n/2;
			
		}
		
			System.out.println("Binary no. is"+a);
							
		}
		
	}
	
	

