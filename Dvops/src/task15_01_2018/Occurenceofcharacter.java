package task15_01_2018;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Occurenceofcharacter {

	public static void main(String[] args)throws IOException {
		System.out.println("enter the string");
		String str;
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		str=d.readLine();
		
		for(int i=0;i<str.length()-1;i++)
		{
			int f=1;
			char c=str.charAt(i);
			int j=i+1;
			while(j<str.length())
			{
				if(c==str.charAt((j)))
					f++;
				j++;
			}
			System.out.println("frequency of "+c+" is "+f);
			
		}
		
		

	}

}
