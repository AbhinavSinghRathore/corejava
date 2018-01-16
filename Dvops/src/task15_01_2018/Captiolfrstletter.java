package task15_01_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Captiolfrstletter {

	public static void main(String[] args)throws IOException {
		System.out.println("enter the string");
		String str,str1=" ";
		
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		str=d.readLine();
		System.out.println(str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.println(str.charAt(i+1));
				continue;
			}
				
		}
		
		

	}

}
