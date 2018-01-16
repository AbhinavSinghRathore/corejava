package task11_01_2018;
import java.io.*;

public class Filehandling {

	public static void main(String[] args)throws IOException {
		
		FileOutputStream ob=new FileOutputStream("HP1.text");
		String message="Abhinav singh";
		for(int i=0;i<message.length();i++)
		{
			ob.write(message.charAt(i));
			
		}
		ob.close();

	}

}
