package com.bridgelabz.functional;
import java.util.Scanner;
public class gambler
{
   public static void main(String[] args)
   {
	   int stake=0;
	   int goal=0;
	   int trials=0;
	   int wins=0;
	   int bets=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stake");
		stake=sc.nextInt();
		System.out.println("enter the goal");
		goal=sc.nextInt();
		System.out.println("enter the trial");
		trials=sc.nextInt();
		for(int t=0;t<trials;t++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			
			if(cash==goal)
			{
				wins++;
			}
		}	
			System.out.println(wins+"wins of"+trials);
			System.out.println("percentage of gambler"+100.0*wins/trials);
			System.out.println("average of bets"+0.1*bets/trials);
		}

	}


