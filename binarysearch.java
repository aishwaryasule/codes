package com.bridgelabz.functional;
import java.util.Scanner;
public class binarysearch 
{
	public static void search(int arr[],int no)
	{
		int first=0,len=arr.length-1;
		int mid=(first+len/2);
		while(first<=len)
		{
			if(no==arr[mid])
			{
				System.out.println("num found");
				break;
			}
			if(arr[mid]<no)
			{
				first=mid+1;
			}
		else
		{
			len=mid-1;
		}
	
		 mid=(first+len/2);
	}
	if(first>len)
	{
		System.out.println("element is not found");
	}	
}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter "+n+" elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		*/
		int arr[]= {10,20,30,40,50};
		
		System.out.println("enter the the number to search");
		int num=sc.nextInt();
		
		
	
		search(arr,num);
	}

}
	
