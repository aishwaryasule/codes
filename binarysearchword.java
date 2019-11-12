package com.bridgelabz.functional;
//import java.util.Scanner;
public class binarysearchword 
{
	public static int search(String arr[],String str1)
	{
		int first =0;
		int len=arr.length-1;
		
		while(first<=len)
	    {
			int mid=(first+len/2);
			int res=str1.compareTo(arr[mid]);
		
		    if(res==0)
		    {
			  return mid;
			 
		    }	
			if(res>0)
		
			res=first+1;
		
		else
		
			res=first-1;
	    }		
		
			return -1;
	}		

	public static void main(String[] args)
	{
		/*Scanner sc=new Scanner(System.in);
	    String[] arr= new String[10];
	    String[] str1=new String[10];
		System.out.println("enter the words in string");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("enter the word to be searched");
		 String str1=sc.nextLine();
		}
	*/	
   String[] arr= {"neha","mina","tina","mona"};
   String str1="xyz";
   		int res=search(arr,str1);
		
		if(res==1)
		{
			System.out.println("element found");
		
		}
		else
	   {
        System.out.println("element not found"+res);
	  }
		
	}	

}
