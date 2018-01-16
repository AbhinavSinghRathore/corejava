package task14_01_2018;
import java.io.*;

public class NMBROFWORDS {

	public static void main(String[] args)throws IOException {
		
		int c=0;
		String s= "My name is abhinav";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				c++;
			}
			
				
		}
		System.out.println(c+1);
	}

}
