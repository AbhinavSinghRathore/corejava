package task15_01_2018;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		 System.out.println("enter the number");
		  int n,c=0;
		    Scanner ob=new Scanner(System.in);
		     n=ob.nextInt();
		     
		      for(int i=1;i<=n;i++)
		      {
		    	  if(n%i==0)
		    	  {
		    		  c++;
		    	  }
		      }
		if(c==2)
		{
			System.out.println("entered number is prime");
		}
		else
		{
			System.out.println("entered number is not prime");
		}
	}

}
