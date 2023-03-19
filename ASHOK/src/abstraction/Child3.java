package abstraction;

public class Child3 extends Parent3 
{

	public static void main(String[] args)
	{
		Child3 c = new Child3();
		c.nm();
		c.ab();
		
		
	}

	@Override
	public void ab()
	{
		int a=6;
		int b=5;
		int c=3;
		int d=4;
		int e=a+b+c+d;
		
		System.out.println(e);
	}

	
}
