package task10_01_2018;

import java.util.*;

 class arms {
	int n,t;

	 arms(int n) {
		this.n=n;
	}
	 void armstrong1()
	{
		int rem,temp,sum=0;
		temp=n;
	
		while(n>0)
		{
		rem=n%10;
		t=rem*rem*rem;
		sum=sum+t;
		n/=10;
		}
		n=temp;
		if(sum==n)
			System.out.println("entered number is armstrong");
		else
			System.out.println("Entered number is not armstrong");
	}
	
		
		
		
}

		class armstrong
		{
			

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number");
		
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		
		arms ob1=new arms(n);
		ob1.armstrong1();
		
		

	}

}
