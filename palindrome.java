package com.bridgelabz.functional;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String args[])
	{	
	  String str;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string to get reversed");
	  str=sc.nextLine();
	  String reverse="";
	  int len=str.length();
	  for(int  i=len-1;i>=0;i--)
	  {
		  reverse=reverse+str.charAt(i);
	  }
	  if(str.equals(reverse))
	  {
		  System.out.println("entered string is palindrome"+str);
	  }
	  else
	  {
		  System.out.println("entered string is not palindrome"+str);
	  }
	
	}
	
}
