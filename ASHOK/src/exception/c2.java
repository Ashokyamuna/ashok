package exception;

public class c2 {

	public static void main(String[] args)
	{
	
	try
	
	{
		System.out.println(3/0);
		
	}
	catch (Exception e)
	{
		System.out.println("error"+e);
		
	}
	
	finally 
	{
		System.out.println("welcome");
	}

}

}
