package task14_01_2018;

public class ChildThread2 extends Thread {
	public void run()
	{
		String s="Abhinav and Aliza are best friends";
		System.out.println(Thread.currentThread().getName()   + s);
	}

	public static void main(String[] args) {
		
		ChildThread2 ct1= new ChildThread2();
		ChildThread2 ct2= new ChildThread2();
		
		ct1.start();
		ct2.start();
		
		
		

	}

}
