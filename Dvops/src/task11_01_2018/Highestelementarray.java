package task11_01_2018;

import java.util.Scanner;

class Highestelementarray {
	


	int findhighest(int a[]) {
		
		int high=0;
		high=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 
			 
			 if(high<a[i])
				 high=a[i];
			 
		 }
		return high; 
	
	}

	public static void main(String[] args) {
		
		int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the size of array ");
		n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ob.nextInt();
		}
		Highestelementarray ob1=new Highestelementarray();
		int h1=ob1.findhighest(arr);
		
		System.out.println(h1);
		

	}

}
