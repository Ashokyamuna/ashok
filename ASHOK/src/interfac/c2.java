package interfac;

public class c2 implements c1 {

	public static void main(String[] args) {
		
		c1 ob = new c2();
		ob.ab();
		ob.nm();
		

	}
	
	public void ab() 
	{
		
		System.out.println("abtract method");
		
	}

}
