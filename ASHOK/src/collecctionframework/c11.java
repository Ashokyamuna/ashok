package collecctionframework;


import java.util.HashMap;

public class c11 {

	public static void main(String[] args) 
	{
		HashMap<String,Integer>t= new HashMap<>();
		t.put("name",5);
		t.put("hello",6);
		t.put("how are you",5);
		t.put("fine",10);
		System.out.println(t);
	
		
		t.remove("name",5);
		System.out.println(t);
		
		System.out.println(t.get("name"));
		
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());
		
	}

}
