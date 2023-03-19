package collecctionframework;

import java.util.TreeMap;

public class c4 {

	public static void main(String[] args) 
	
	{
		TreeMap<Double,Integer>t= new TreeMap<>();
		t.put(0.9,5);
		t.put(5.9,6);
		t.put(7.9,5);
		t.put(10.9,5);
		System.out.println(t);
		
		
		t.remove(0.9);
		System.out.println(t);
		
		System.out.println(t.get(10.9));
		
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());
		
	}

}
