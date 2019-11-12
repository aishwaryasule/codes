package com.bridgelabz.functional;
import java.util.Scanner;
public class distance {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x value");
		double x=sc.nextInt();
		System.out.println("enter the y value");
		double y=sc.nextInt();
		double des;
		double des1;
		double res;

		des=(int) Math.pow(x,2);
		des1=(int) Math.pow(y,2);
		res=Math.sqrt(des1+des);
		System.out.println(res);
	}

}
