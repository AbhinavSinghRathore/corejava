package task09_01_2018;
import java.util.*;

public class Switchcalc {

	public static void main(String[] args) {
		
		   int n,n1,sum,multiply,sub; 
		float divison;
		divison=1;

		sum=0;
		multiply=1;
		sub=0;
		char c;

		Scanner ob =new Scanner(System.in);
		System.out.println("enter two num");

		n=ob.nextInt();
		n1=ob.nextInt();

		System.out.println(" S for sum \n   M for multiplication \n D for divison \n A for subtraction");
		

		c=ob.next().charAt(0);

		switch(c)
		{ 
		 case 'S':
		sum=n+n1;
		 System.out.println(sum);
		break;
		case 'M':
		multiply=n*n1;
		System.out.println(multiply);
		break;
		case 'D':
		divison=n/n1;
		
	    System.out.println(divison);
	    break;
		case 'A' :
		sub=n-n1;
		System.out.println(sub);
		
        
		}
		
		

	}

}
