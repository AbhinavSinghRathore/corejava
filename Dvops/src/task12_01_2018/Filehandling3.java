package task12_01_2018;
import java.io.*;


public class Filehandling3 {
	public static void main(String[] args)throws IOException
	{
		FileOutputStream ob=new FileOutputStream("Thakur.text");
		String s="Rajput Family1";
		for(int i=0;i<s.length();i++)
		{
			ob.write(s.charAt(i));
		}
			ob.close();
			
			FileInputStream ob1= new FileInputStream("Thakur.text");
			
			int a=0;
			a=ob1.available();
			byte arr[]=new byte[a];
			ob1.read(arr,0,a);
			
			String content=new String(arr);
			System.out.println(content);
				
	
	

}
}
