package task12_01_2018;
import java.io.*;

public class Filehandling7 {

	public static void main(String[] args)throws IOException {
		
		//FileReader fr=new FileReader("C:\\Abhinav.txt");
		
		BufferedReader br= new BufferedReader(new FileReader("C:\\Abhinav.txt"));
		
		while(br.readLine()!=null) {
			System.out.println(br.readLine());
		}
	
	
	
		
	
		

	}

}
