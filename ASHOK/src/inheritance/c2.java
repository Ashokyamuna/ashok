package inheritance;

public class c2 extends c1 {

	public static void main(String[] args) 
	{
		c2.cs();
		c2 c =new c2();
		c.cn();
		
		
		c.cs();
		c.cn();
	}



public static void cs() 
{
	System.out.println(" child static");
	
	
}
public void cn() 
{
	System.out.println(" child nonstatic");
	
	
}

}