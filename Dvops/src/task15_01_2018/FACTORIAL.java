package task15_01_2018;

import java.util.*;

public class FACTORIAL {

	public static void main(String[] args) {
	
		System.out.println("enter the number");
		int n,i,f=1;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		for(i=1;i<=n;i++)
	{
			f=f*i;
	}

	System.out.println("Factorial of " + n + " is "+ f);
	}

}
