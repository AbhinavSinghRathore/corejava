package task15_01_2018;
import java.util.*;

public class Pallindrome {

	public static void main(String[] args) {
		System.out.println("enter the number");
		int n,rem,rev=0,temp;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		n=temp;
		if(n==rev)
		{
			System.out.println("enterd number is pallindrome");
		}
		else
		{
			System.out.println("entered number is not pallindrome");
		}
}
}
