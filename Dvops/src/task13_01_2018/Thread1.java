package task13_01_2018;

public class Thread1 {
	public static void main(String[] args)
	{
		
		Thread mt= Thread.currentThread();
		//System.out.println("Main thread name is " + mt.getName());
		//System.out.println("Main thread priority is "+ mt.getPriority());
		mt.setName("Important thread");
		mt.setPriority(7);
		System.out.println("Main thread name is " + mt.getName());
		System.out.println("Main thread priority is "+ mt.getPriority());
	}

}
