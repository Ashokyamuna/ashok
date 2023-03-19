package collecctionframework;

import java.util.ArrayList;

public class c6 {

	public static void main(String[] args)
	
	{
		ArrayList<String>t= new ArrayList<>();
		t.add("hi");
		t.add("how are you");
		t.add(" i am fine");
		
		
		t.remove(0);
		System.out.println(t);
		
		System.out.println(t.get(0));
		
		for (String x : t) 
		{
			
			System.out.println(x);
		}
	}
	

}
