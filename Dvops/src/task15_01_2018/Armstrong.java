package task15_01_2018;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter the number");
		 int n,rem,d,retain=0,temp=0;
		 Scanner ob=new Scanner(System.in);
		 n=ob.nextInt();
		 temp=n;
		 while(n>0)
		 {
			 rem=n%10;
			 d=rem*rem*rem;
			 retain=retain+d;
			 n/=10;
			 
		 }
		n=temp;
		if(n==retain)
		{
			System.out.println("entered number is armstrong");
		}
		else
		{
			System.out.println("entered number is not armstrong");
		}

	}

}
