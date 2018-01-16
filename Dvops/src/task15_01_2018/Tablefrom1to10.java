package task15_01_2018;



public class Tablefrom1to10 {

	public static void main(String[] args) {
		int i,p=1,j;
        for(i=1;i<=10;i++)
        {
        	for( j=1;j<=10;j++)
        	{
        		p=j*i;
        		System.out.println(i + "*"+ j + "= " + p);
        	}
        	
        }

	}

}
