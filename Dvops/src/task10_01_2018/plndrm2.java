package task10_01_2018;

import java.io.*;


public class plndrm2 {

	public static void main(String[] args)throws IOException {
		
		
		System.out.println("enter the text");
		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
		
		String s,rev;
	
		s=d.readLine();
		rev="";
		StringBuffer str=new StringBuffer(s); 
		rev=str.reverse().toString();
		
		
		if(s.equalsIgnoreCase(rev))
			System.out.println("Entered string is pallindrome");
		else
			System.out.println("Entered string is not pallindrome");
		
		

	}

}
