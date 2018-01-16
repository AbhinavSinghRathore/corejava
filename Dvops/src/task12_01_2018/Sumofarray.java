package task12_01_2018;
import java.util.*;
import java.io.*;


public class Sumofarray {
	

	
		
		int add(int a[])
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			return sum;
		}
		

		public static void main(String[] args) {
			
			int n;
			Scanner ob=new Scanner(System.in);
			System.out.println("enter the size of array");
			
			n=ob.nextInt();
			int arr[]=new int[n];
			System.out.println("enter the elements");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=ob.nextInt();
			}
			
			Sumofarray ob1=new Sumofarray();
			 int sum1=ob1.add(arr);
			 System.out.println("sum of entered elements =" +sum1);
			
	}

}
