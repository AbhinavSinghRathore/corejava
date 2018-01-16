package task15_01_2018;
import java.io.*;
import java.util.*;

public class Reverseofstring {

	public static void main(String[] args)throws IOException {
		System.out.println("enter the string");
		String str,str1="";
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		str=d.readLine();
		for(int i=(str.length()-1);i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
System.out.println("Reverse of string  " + str1);
	}

}
