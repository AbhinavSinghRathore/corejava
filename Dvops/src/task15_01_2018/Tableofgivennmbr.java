package task15_01_2018;

import java.util.Scanner;

public class Tableofgivennmbr {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
        int n,p=1,i;
        Scanner ob= new Scanner(System.in);
        n=ob.nextInt();
        for(i=0;i<=10;i++)
        {
        	p=i*n;
        	System.out.println(n + "*"+ i + "= " + p);
        }
        
	}

}
