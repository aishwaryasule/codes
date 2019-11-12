package com.bridgelabz.functional;

public class magicmat 
{
	 public static void main(String args[])
	 {
		 int a[][]= {{2,1,1} ,{1,1,1},{1,1,1}};
		 int  sum1=0;
		 int sum2=0;
		 int sum3=0;
		 int sum4=0;
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 sum1=sum1+a[i][j];
				 sum2=sum2+a[j][i];
				 if(i==j)
				 {
					 sum3=sum3+a[i][j];
				 }
				 if(i+j==2)
				 {
					 sum4=sum4+a[i][j];
				 }
					 
			 }
			 
			
			 
		 }
		 sum1=sum1/3;
		 sum2=sum2/3;
		 System.out.println(sum1+ "" +sum2+  ""+sum3+ ""+sum4);
		 if(sum1==sum2 && sum3==sum4 && sum2==sum1 && sum1==sum2)

		 {
			 System.out.println("it is magic square");
		 }
		 else
		 {
			 System.out.println("it is not magic square");
		 }
		 
		
	 }
}
