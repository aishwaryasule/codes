package com.bridgelabz.functional;
import java.util.Scanner;

public class armstrong
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong");
        
        int actualNumber = scanner.nextInt();
        int temp = actualNumber;
        int remainder = 0;
        int sum = 0;
        int count= 0;
        
        // Get the total number of digits
        while(temp != 0)
        {
            temp = temp / 10;
            count++;
        }
        temp = actualNumber;
        
        // Check for Armstrong Number
        while(temp != 0)
        {
            remainder = temp  % 10;
            sum = (int) (sum + Math.pow(remainder, count));
            temp = temp / 10;
        }
        
        if(actualNumber == sum)
            System.out.println(actualNumber + " is an Armstrong Number");
        else
            System.out.println(actualNumber + " is not an Armstrong Number");
    }
}