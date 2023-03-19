package collecctionframework;

import java.util.TreeSet;

public class c3
{

	public static void main(String[] args) 
	{
		
		TreeSet<String>t= new TreeSet<>();
		t.add("hi");
		t.add("hello");
	    t.add("how are you");
	    t.add("i am fine");
	    System.out.println(t);
	    
	    t.remove("hi");
	    System.out.println(t);
	    
	    
	    for(String x:t)
	    {
	    	
	    	System.out.println(x);
	    	
	    }
	    
	}
	
}



	   
	    


