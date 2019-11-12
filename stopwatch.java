package com.bridgelabz.functional;
import java.util.Scanner;
public class stopwatch 
{
	public long StartTime;
	public long StopTime;
	public boolean Running;
	
	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		public long StartTime;
		public long StopTime;
		public long Running;
		 System.out.println("enter the start time");
		 StartTime=sc.nextInt();
		 System.out.println("enter the stop time");
		 StopTime=sc.nextInt();
*/		 
		 public void start()
		 {
			 this.StartTime=System.currentTimeMillis();
			 this.Running=true;					 
		 }
		 public void stop()
		 {
			 this.StartTime=System.currentTimeMillis();
			 this.Running=false;
		 }	 
		 public long getElapsedTime()
		 {
			 long elapsedtime;
			 if(Running)
			 {

				 elapsedtime=System.currentTimeMillis()-StartTime;
				 System.out.println(elapsedtime);	 
			 }
			 else
			 {
				 elapsedtime=StopTime-StartTime;
				 System.out.println(elapsedtime);
			 }
			return elapsedtime;
			 
	    }
		 public static void main(String args[])
		 {
			 stopwatch st=new stopwatch();
			 st.start();
			 st.stop();
			 System.out.println("print elapsed time"+st.getElapsedTime());
		 }
		
	

}
