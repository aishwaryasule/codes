package com.bridgelabz.functional;
import java.util.Scanner;
public class searchingTechnique 
{
	static void BinarySearch(int arr[],int key)
	{
		
		int first=0;
		int len=arr.length;
		int mid=(first+len/2);
		while(first<=len)
		{
			if(key==arr[mid])
			{
				System.out.println("element is found");
				break;
			}
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else
			{	
				len=mid-1;
			}
			mid=(first+len)/2;
		}
		if(first>len)
		{
			System.out.println("element is not found");
		}	
	}
	static void Bubblesort(int arr[],int temp)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[i]>arr[j+1])
				{
					temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			   }
		  }
	
		
				for( int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]+ "");
				}
	}		
		
	static void insertionsort(int arr[], int temp)
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 temp=arr[i];
			 for(int j=i+1;j<arr.length;j++)
			 {
				
				 
				 while(j>0 && arr[j-1]>temp)
				 {
					 arr[j]=arr[j+1];
					 j=j-1;
					 
				 }
				 arr[j+1]=temp;
			 } 
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]+ "");
		 }
		
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int key;
		int arr[]={20,10,30,50,60,100,80};
		
		
	int ch;
	do {
		System.out.println("Enter your choice");
		
		System.out.print("1.Binary search");
		
		System.out.print(" 2.Bubble sort");
		
		System.out.print(" 3.insertion sort\t 0.exit");
		 ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{  
				System.out.println("enter the no. to search");
				key=sc.nextInt();
				BinarySearch(arr,key);
				break;
			}
			case 2:
			{
				
				Bubblesort(arr, ch);
				break;
			}
			case 3:
			{
				int temp=0;
				insertionsort(arr,ch);
				break;
			}
			
		}
		

	}while(ch!=0);

}
}
