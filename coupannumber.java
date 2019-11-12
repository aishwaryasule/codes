package com.bridgelabz.functional;
import java.util.*;
public class coupannumber 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new <String>HashSet();
		
		char chars[]="ABCDEfghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz12345678910".toCharArray();
		String sb=new String(" ");
		Random random=new Random();
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)

			{
				char c= chars[random.nextInt(chars.length)];
				sb=sb+c;
			}
			hs.add(sb);
			sb=" ";
		}
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
