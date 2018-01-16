package task14_01_2018;
import java.io.*;
class Sync{
	public synchronized static  void withdraw(String operation[])throws IOException
	{
		for(String operation1:operation)
		{
			System.out.println(Thread.currentThread().getName() + operation1);
		}
	}
}

public class ThreadSync implements  Runnable {
	
	String operation[]= {"Enter amount","enter pin","validate balance","process transaction","update","close"};
//@Override
	public void run()
	{
		try {
			Sync.withdraw(operation);
		} catch (IOException e) {
			
		
		}
	}
		

	public static void main(String[] args)throws IOException {
		
		
		ThreadSync T=new ThreadSync();
		Thread T1=new Thread(T);
		Thread T2=new Thread(T);
		T1.setName("Abhinav");
		T2.setName("Aliza");
		T1.start();
		T2.start();

	}



	
		
	}
