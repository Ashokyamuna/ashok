package collecctionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class c7 {

	public static void main(String[] args)
	{
	
    ArrayBlockingQueue<String>s= new ArrayBlockingQueue<>(4);
    
    s.add("my name is ashok");
    s.add("my wife name is yamuna");
    s.add("She is my best wife");
    s.add(" she love me very much");
    
    s.remove(0);
    System.out.println(s);
    
    System.out.println(s.peek());
  
   for (String x:s)
   {
	   
	   System.out.println(s);
	   
   }
    
    
    
	}

}
