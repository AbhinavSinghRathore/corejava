package task10_01_2018;

public class Arrayz {
	void copyarray(int arr[])
	
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
	}
	
	public static void main(String[] args)
	{
		
		Arrayz ob=new Arrayz();
		
	int a[]= {1,2,3,4,5,6};
	
	ob.copyarray(a);
		/* int a2[]= {0,0,0,0,0,0};
		 int i;
		 for( i=0;i<=5;i++)
		 {
			 a2[i]=a[i]; 
			 System.out.print(a2[i]);
		 }
		*/ 
		 
	}

}
