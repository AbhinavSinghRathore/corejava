package task15_01_2018;
import java.util.*;

public class Highestnmbr {

	public static void main(String[] args) {
	
		int n;
		System.out.println("enter the size of array ");
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int a[]=new int[n];
		System.out.println("enter 3 numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		int high=a[0];
for(int i=1;i<a.length;i++)
{
	if(high<a[i])
	{
		high=a[i];
	}
}
System.out.println("highest numbers is "+ high);
	}

}
