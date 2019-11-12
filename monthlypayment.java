package com.bridgelabz.functional;
import java.util.Scanner;
public class monthlypayment 
{
	public static void main(String[] args)
	{
		double principal,interest,payment,year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle");
		 principal=sc.nextDouble();
		 System.out.println("enter the time in year");
		 year=sc.nextDouble();
		 System.out.println("enter the interest");
		 interest=sc.nextDouble();
		 interest=interest/(12*100);
		 year=year*12;
		 payment=(principal*interest*Math.pow(1+interest, year))/(Math.pow(1+interest,year)-1);
		 System.out.println("monthly payment is" +payment);
		

	}

}
