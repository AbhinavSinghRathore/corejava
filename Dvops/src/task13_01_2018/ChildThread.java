package task13_01_2018;

public class ChildThread extends Thread{
	
 public	void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ":" + i);
			 //System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ChildThread ct1= new ChildThread();
		ChildThread ct2= new ChildThread();
		 ct1.start();
		 ct2.start();
		
		


	}

}
