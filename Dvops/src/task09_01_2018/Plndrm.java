package task09_01_2018;
import java.util.*;
import java.io.*;

public class Plndrm {

	public static void main(String[] args)throws IOException {
		
		System.out.println("enter the text");
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		String text,temp;
		temp="";
		text=d.readLine();
		for(int i=(text.length()-1);i>=0;i--)
		{
			temp=temp+text.charAt(i);
			
		}
		
if(temp.equalsIgnoreCase(text))
	System.out.println("Entered string is pallindrome");
else
	System.out.println("Entered string is not pallindrome");
	}

}
