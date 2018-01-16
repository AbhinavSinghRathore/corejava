package task14_01_2018;

public class ThreadPractise2 {
	public static void main(String[] args)
	{
		Thread mt=Thread.currentThread();
		//System.out.println("Name of main thread is " + mt.getName());
		//System.out.println("Pririty of main thread by default is "+ mt.getPriority());
		 // if we want to change the name and priority of thred thn make use of set method
		
		
		
	mt.setName("Abhinav thread");
	mt.setPriority(2);
	System.out.println("now the name of main thread is " + mt.getName());
	System.out.println(" now the Pririty of main thread by default is "+ mt.getPriority());
	
	
	
	}
			

}