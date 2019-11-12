package com.bridgelabz.functional;
import java.util.Scanner;
public class darray
{

	public static void main(String[] args) 
	{
		int a[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
              		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the columns");
		int colunms=sc.nextInt();
		System.out.println("enter" +(rows*colunms)+ "array elements");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colunms;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The array is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colunms;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(      );
		}
		
		
		
	}

}
