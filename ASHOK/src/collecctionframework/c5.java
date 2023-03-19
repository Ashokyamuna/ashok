package collecctionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class c5 {

	public static void main(String[] args) 
	
	{
		Hashtable<Integer,String>t =new Hashtable<>();
		t.put(10,"lemon");
		t.put(120,"tomoto");
		t.put(30,"brinjal");
		t.put(40,"coconut");
		System.out.println(t);
		
		
		t.remove(10);
		System.out.println(t);
		
		System.out.println(t.get(120));
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		System.out.println(t);
		
		
		
	}

}
