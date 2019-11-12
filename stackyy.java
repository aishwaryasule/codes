package com.bridgelabz.functional;
import java.util.*;
public class stackyy 
 {
  static class stack
  {
	 int top=-1;
	 char items[]=new char[100];
	 
	 void push(char x)
	  {
		 if(top==99)
		 {
			System.out.println("stack is full");
		 }	
		 else
		  {	  
			  top++;
			  items [++top] =x;
			  
		  }	  
		
	  }
	 char pop()
	{
		if(top==-1)
		{
			System.out.println("underflow error");
			return '\0';
		}
		else
		{
			char element=items[top];
			top--;
			return element;
		}		
	}
boolean isEmpty()
{
	return (top==-1)?true:false;
}
static boolean isMatchingPair(char character1,char character2)
{
	if(character1=='(' && character2==')')	
		return true;
	else if(character1=='{' && character2=='}')
		return true;
	else if(character1=='[' && character2==']')
		return true;
	else
		return false;
    
}	
static boolean areParenthesisBalanced(char exp[])
{
	stack st=new stack();
	for(int i=0;i<exp.length;i++)
	{
		if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[')
		{
			st.push(exp[i]);
		}
		if(exp[i]=='}' || exp[i]==')' || exp[i]==']')
		{
			if(st.isEmpty())
			{
				return false;
			}
			else if(! isMatchingPair(st.pop(),exp[i]))
			{
				return false;
			}
		}
	}

	if(st.isEmpty())
	{
		return true;
	}
	else
	{
		return false;
	}
					
	}
	public static void main(String args[])
	{
	
	   String str= "{(5+6)*(7+8)/(4+3)*(5+6)*(7+8)/(4+3)}";
		char exp[]=str.toCharArray();
		if(areParenthesisBalanced(exp))
		{
			System.out.println("they are balanced");
		}
		else
		{
			System.out.println("they are not balanced");
		}
	}
	
	}
 }
	
