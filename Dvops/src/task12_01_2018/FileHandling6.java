package task12_01_2018;
import java.io.*;

public class FileHandling6  {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("C:\\Abhinav.txt");
		char studentdetail[]=new char[500];
		fr.read(studentdetail);
		
		String records=new String(studentdetail);
		System.out.println(records);
		fr.close();

	}

}
