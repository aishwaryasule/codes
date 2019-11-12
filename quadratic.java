package com.bridgelabz.functional;
import java.util.Scanner;
public class quadratic 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st value");
		double a=sc.nextDouble();
		
		System.out.println("enter the 2nd value");
		double b=sc.nextDouble();
		
		System.out.println("enter the 3rd value");
		double c=sc.nextDouble();
		
		double delta=b*b-4*c*c;
		
		if(delta>=0.0)
		{
	        double Root1 =((-b + Math.sqrt(delta))/(2*a));
	        
	        double Root2 =((-b - Math.sqrt(delta))/(2*a));
	        
	        System.out.println("print"+Root1+ "values" +Root2);
		}
		else if(delta==0.0)
		{
			double root1=-b/(2.0*a);
			System.out.println(root1);
	        		
		}    
		else
		{
			System.out.println("root are not real");
		}
	    
	}

}
