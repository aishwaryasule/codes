package com.bridgelabz.functional;
import java.util.*;
public class Sqrt {
	

	    public static double squareRoot(int number) {
		double temp;

		double root = number / 2;

		do {
			temp = root;
			root = (temp + (number / temp)) / 2;
		} while ((temp - root) != 0);

		return root;
	    }

	    public static void main(String[] args)  
	    { 
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
		scanner.close();

		System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
	    } 
	}


