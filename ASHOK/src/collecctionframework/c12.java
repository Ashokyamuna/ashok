package collecctionframework;

import java.util.TreeMap;

public class c12 {

	public static void main(String[] args) 
		{
			TreeMap<Double,String>t= new TreeMap<>();
			t.put(5.6,"hi");
			t.put(6.5,"hello");
			t.put(4.5,"hai");
			t.put(4.4,"helloo");
			System.out.println(t);
		
			
			t.remove(6.5,"hello");
			System.out.println(t);
			System.out.println(t.get(4.5));
			
			
			System.out.println(t.keySet());
			
			System.out.println(t.values());
			
		}

	
}
		

	


