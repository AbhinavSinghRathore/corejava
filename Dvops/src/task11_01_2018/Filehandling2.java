package task11_01_2018;
import java.io.*;


public class Filehandling2  {

	public static void main(String[] args)throws IOException {
		
FileInputStream ob=new FileInputStream("HP1.text");
int avl=0;
avl=ob.available();
byte buff[]=new byte[avl];
ob.read(buff,0,avl);
String content=new String(buff);
System.out.println(content);
	}

}
