package com.bridgelabz.functional;
import java.util.Scanner;
public class tempratureconversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double f;
		System.out.println("enter the temprature in farenhite");
		f=sc.nextDouble();
		double c=(f-32)*5/9;
		System.out.println(c);
		
		
		
		System.out.println("enter the temprature in celcius");
		c=sc.nextInt();
		f=(c*9/5)+32;
		System.out.println(f);
		
		
		
		
	}
}
