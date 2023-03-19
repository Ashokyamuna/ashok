package collecctionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class c2 {

	public static void main(String[] args)
	
	{
		ArrayBlockingQueue<Integer>t =new ArrayBlockingQueue<>(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		System.out.println(t);
		
		t.remove(5);
		System.out.println(t);
		
		System.out.println(t.peek());
		
		for(int x: t)
			
		{
			
			System.out.println(x);
			
		}
		
	}

}
