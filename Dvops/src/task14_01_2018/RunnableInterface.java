package task14_01_2018;

public class RunnableInterface implements Runnable {

	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
			//System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		RunnableInterface RT1= new RunnableInterface();
		//RunnableInterface RT2=new RunnableInterface();
		
		Thread t1= new Thread(RT1);
		Thread t2= new Thread(RT1);
		
		t1.setName("Runnable1");
		t2.setName("Runnable2");
		
		t1.start();
		t2.start();
		
	
		

	}

}
