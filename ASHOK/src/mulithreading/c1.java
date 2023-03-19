package mulithreading;

public class c1 extends Thread {

	public static void main(String[] args)
	{
		c1 ob = new c1();
		ob.start();
	}
	
	
	public void run ()
	{
		System.out.println("Thread has started running");
		

	}

}
