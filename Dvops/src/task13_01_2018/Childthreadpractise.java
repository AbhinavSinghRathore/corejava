package task13_01_2018;

public class Childthreadpractise extends Thread {
	
	public void run()
	{
		System.out.println("its abhinav dream to buy Mustang");
	}

	public static void main(String[] args) {
		
Childthreadpractise Ct1= new Childthreadpractise();
Childthreadpractise Ct2=new Childthreadpractise();
Ct1.start();
Ct2.start();
	}

}
