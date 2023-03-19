
		package collecctionframework;

		import java.util.HashSet;

		public class c10	
		
		{

			public static void main(String[] args) 
			{
				
				HashSet<String>t= new HashSet<>();
				t.add("4.5");
				t.add("5.6");
			    t.add("4.4");
			    t.add("5.4");
			    System.out.println(t);
			    
			    t.remove("hi");
			    System.out.println(t);
			    
			    
			    for(String x:t)
			    {
			    	
			    	System.out.println(x);
			    	
			    }
			    
			}
			
		

	}


