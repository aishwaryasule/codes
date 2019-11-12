package com.bridgelabz.functional;

import java.util.Scanner;

public class caracteroccurance 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		char count[]=new char[100];
		int  a=1,len=str.length(); 
		char ch;
		for(int i=0;i<len;i++)
		{
			count[i]=str.charAt(i);
		}
		for(int i=0;i<len;i++)
		{
			ch=count[i];
			a=1;
			for(int j=i+1;j<len;j++)
			{
				if(ch==count[j])
				{
				 a++;
				}
			}
			if(a>1)
			{
				System.out.println(ch+" is present "+a +" no of times");
			}
			else {
				System.out.println("no repeated characters");
				break;
			}
						
		}
		
	}
}
