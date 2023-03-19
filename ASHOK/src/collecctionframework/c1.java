package collecctionframework;

import java.util.ArrayList;

public class c1 {

	public static void main(String[] args) 
	{
		ArrayList<String>l= new ArrayList<>();
		l.add("hi");
		l.add("hello");
		l.add("how");
		
		l.remove(0);
		System.out.println(l);
		
		
		System.out.println(l.get(0));
		
		for (String x:l)
			
		{
			
				System.out.println(x);
				
		}
	}

}
