package task15_01_2018;

public class Factorialrange {

	public static void main(String[] args) {
		
		int i,f=1,j;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=i;j++)
			{
				f=f*j;
				
			}
			System.out.println("factorial of " + i+ "is "+  f);
		}
			
		
	}

}
