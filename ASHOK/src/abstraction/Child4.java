package abstraction;

public class Child4 extends Parent4 {

	public static void main(String[] args)
	{
		Child4 c= new Child4();
		c.nm();
		c.ab();

	}

	@Override
	public void ab()
	{
	
		int a=6;
		int b=7;
		int c=6;
		int d=a+b+c;
		
		System.out.println(d);
	}

}
