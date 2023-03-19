package abstraction;

public class Child1  extends Parent2 {
	
public static void main(String[] args) 
	{
		Child1 c= new Child1();
		c.nm();
		c.ab();
		
	}

@Override
public void ab()
{
	int a=4;
	int b=5;
	int c=a+b;
	System.out.println(c);
	
	
}

}
