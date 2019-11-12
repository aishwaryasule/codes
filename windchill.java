package com.bridgelabz.functional;
import java.util.Scanner;
public class windchill 
{
	public static void main(String[] args) 
	{
		double t=1;
		double v=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temprature");
		 t=sc.nextDouble();
		System.out.println("enter the value");
		 v=sc.nextDouble();
		 double windchillindex=calculatewindchil(t,v);
		//int wind=(int) ((int)(35.74+0.6215t+(0.4275t-35.75)v * Math.pow(v, 0.16));
		 System.out.println("print the windchill index" +windchillindex);		
		 
    }
	
}
