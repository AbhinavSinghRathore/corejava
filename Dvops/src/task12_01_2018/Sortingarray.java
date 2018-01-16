package task12_01_2018;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sortingarray {
	
	
	
	void sortarray(int a[])
	{
		int temp=0;
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
		    if(a[j]>a[j+1])
		    {
		    temp=a[j];
		    a[j]=a[j+1];
		    a[j+1]=temp;
		    
		    
		    }
			}
		}
		for(int k=0;k<a.length;k++)
		System.out.println(a[k]);
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
		Sortingarray ob1=new Sortingarray();
		ob1.sortarray(arr);
		

	}

}
