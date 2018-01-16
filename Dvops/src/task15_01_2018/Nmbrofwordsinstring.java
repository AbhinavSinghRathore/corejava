package task15_01_2018;

import java.io.*;
import java.util.*;

public class Nmbrofwordsinstring  {

	public static void main(String[] args)throws IOException {
		System.out.println("enter the string");
		String str;
		int c=0;
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		str=d.readLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				c++;
		}
		System.out.println("Number of words in a given string is " + (c+1));

	}

}
