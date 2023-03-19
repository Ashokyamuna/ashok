package mulithreading;

public class multithread2 implements Runnable 
{

	public static void main(String[] args)
	{
		multithread2 ob =new multithread2 ();
		Thread t1= new Thread(ob);
		t1.start();
	}
	
	public void run () {
		System.out.println("Thread has started running");
	}
	
		

	}


