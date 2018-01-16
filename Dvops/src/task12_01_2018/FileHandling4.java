package task12_01_2018;
import java.io.*;
public class FileHandling4 {

	public static void main(String[] args)throws IOException {
		
BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
BufferedWriter ob1=new BufferedWriter(new FileWriter("INDIA.text",true));
//FileOutputStream ob1=new FileOutputStream("Bittu.text");
String s;
System.out.println("Enter the text");

s=d.readLine();
ob1.write(s);
ob1.close();
/*for(int i=0;i<s.length();i++)
{
	ob1.write(s.charAt(i));
	
}
ob1.close();*/
BufferedReader ob2=new BufferedReader(new FileReader("INDIA.text"));
/*FileInputStream ob2=new FileInputStream("INDIA.text");
int a=0;
a=ob2.available();
byte arr[]=new byte[a];
ob2.read(arr,0,a);
String content= new String(arr);
System.out.println(content);*/

System.out.println(ob2.readLine());



	}

}
