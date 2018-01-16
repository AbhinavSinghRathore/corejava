package task13_01_2018;

public class Theadpractise {

	public static void main(String[] args) {
		
		Thread mt=Thread.currentThread();
		System.out.println("Main thread is " + mt.getName());
		System.out.println("Thread priority is " + mt.getPriority());
		

	}

}
