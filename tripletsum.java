package com.bridgelabz.functional;
import java.util.Scanner;
public class tripletsum 
{
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
				
		}
		System.out.println("enter the target");
		int target=sc.nextInt();
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==target)
					{
						System.out.println("Target found at" +i+ "\t" +j+ "\t" +k+ "\t");
					}
				}
				
			}}
						System.out.print("Not found");
					
					}
					
				 
				}
			
		


		
			
		
		
	

	
	