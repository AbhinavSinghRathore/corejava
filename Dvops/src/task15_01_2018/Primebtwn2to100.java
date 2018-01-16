package task15_01_2018;

import java.util.*;

public class Primebtwn2to100 {

	public static void main(String[] args) {
		 
		  int n,c=0,i;
		    Scanner ob=new Scanner(System.in);
		     n=ob.nextInt();
		     
		      for(i=2;i<=100;i++)
		      {
		    	  for(int j=1;j<=i;j++)
		    	  {
		    		  if(i%j==0)
		    		  {
		    		  c++;
		    	  }
		    		  if(c==2)
		    			{
		    				System.out.println(i);
		    			}
		    			
		      }
		

	}

	}
}
