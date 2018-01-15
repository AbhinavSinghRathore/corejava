package task10_01_2018;

import java.util.Scanner;

class armstrong2 {
	 int n,t;
 

	
	armstrong2(int n) {
		
	this.n=n;
		}
		 int armstrong1()
		{
			int rem,sum=0;
			
		
			while(n>0)
			{
			rem=n%10;
			t=rem*rem*rem;
			sum=sum+t;
			n/=10;
			}
			
			return sum;
			
		}
		
		
		  public static void main(String[] args) {
		
		    int n,sum1;
		    System.out.println("enter the number");
		
		     Scanner ob=new Scanner(System.in);
		      n=ob.nextInt();
		      armstrong2 ob1=new armstrong2(n);
		
		       sum1=ob1.armstrong1();
		         if(sum1==n)
		 	          System.out.println("entered number is armstrong");
		                else
		 	          System.out.println("Entered number is not armstrong");

		
		
		
		
		
		
		
		
		
	}

}
