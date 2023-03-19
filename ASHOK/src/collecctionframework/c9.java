
		package collecctionframework;

		import java.util.concurrent.ArrayBlockingQueue;

		public class c9
		{
			
		
			public static void main(String[] args)
			{
			
		    ArrayBlockingQueue<Boolean>s= new ArrayBlockingQueue<>(4);
		    
		    s.add(true);
		    s.add(false);
		    s.add(true);
		    s.add( false);
		    
		    s.remove(0);
		    System.out.println(s);
		    
		    System.out.println(s.peek());
		  
		   for (Boolean x:s)
		   {
			   
			   System.out.println(s);
			   
		   }
		    
		    
		    
			}

		
	}


