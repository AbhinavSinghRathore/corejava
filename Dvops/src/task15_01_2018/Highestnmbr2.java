package task15_01_2018;
import java.util.*;

public class Highestnmbr2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		int n;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ob.nextInt();
			
		}
		int high=arr[0];
		int low=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(high<arr[i])
			{
				high=arr[i];
			}
		}
System.out.println("Highest number is " + high);

for(int i=1;i<arr.length;i++)
{
if(low>arr[i])
{
	low=arr[i];
}

	}
System.out.println("lowest number is " +low);

}
}
