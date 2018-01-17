package task17_01_2018;

import java.util.Scanner;



public class Calculator {
	int a,b;
	
	Calculator( int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void operation()
	{
		int sum,multiply,sub,divison;
		
		
		divison=1;

		sum=0;
		multiply=1;
		sub=0;
		Scanner sc =new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);

		switch(c)
		{ 
		 case 'S':
		sum=a+b;
		 System.out.println(sum);
		break;
		case 'M': 
		multiply=a*b;
		System.out.println(multiply);
		break;
		case 'D':
		divison=a/b;
		
	    System.out.println(divison);//(b>0?a/b: "Infinite");
	    break;
		case 'A' :
		sub=a-b;
		System.out.println(sub);
		
     
		}
	}
	
	public static void main(String[] args) {
		
		   int n,n1;
		

		Scanner ob =new Scanner(System.in);
		System.out.println("enter two num");

		n=ob.nextInt();
		n1=ob.nextInt(); 
		System.out.println(" S for sum \n   M for multiplication \n D for divison \n A for subtraction");
		Calculator ob1=new Calculator(n,n1);
		ob1.a=5;
		ob1.operation();
		
		

		
		

		

}
}
