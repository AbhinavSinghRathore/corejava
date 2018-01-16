package task12_01_2018;

import java.util.*;

public class Dplctvalarray {
	
	
	void duplicatevalue(int a[]){
		
		 
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				System.out.println(a[i]);
				
		
		}
		
				
		
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
		Dplctvalarray ob1=new Dplctvalarray();
		
		ob1.duplicatevalue(arr);
		

	}

}
