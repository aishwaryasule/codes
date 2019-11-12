package com.bridgelabz.functional;
import java.util.Scanner;
public class vendingmachine
{
   public static void main(String args[])
   {
	  Scanner sc=new Scanner(System.in);
	  int notes[]= {2000,500,100,50,20,10,5,2,1,0};
      int notescounter[]=new int[9];
      int len=notes.length;
      System.out.println("enter the amount");
   	  int amount=sc.nextInt();
   	  System.out.println(amount);
       for(int i=0;i<9;i++)
       {
    	  if(amount>=notes[i])
    	 {
    	      notescounter[i]=amount/notes[i];
    	      amount=amount-notescounter[i]*notes[i];
    	  }
    	  else
    	  {  
    		  notescounter[i]=notes[len-1];
    	  }
    	   
       }
       System.out.println("count of notes");
       for(int i=0;i<9;i++)
       {
    	   System.out.println(notescounter[i]+ ":" +notes[i]);
    	   
       }
   }
} 
       