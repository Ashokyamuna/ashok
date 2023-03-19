package overloading;

public class c2 {

	public static void main(String[] args) 
	
	{
		c2.area();
		c2.area();
		c2.area(5);
		c2.area(4.4);
		c2.area(5,4.5);
		

	}


public static void area()
{
	System.out.println("area");
}

public static void area (int s)
{
	System.out.println( "perimeter of square"+ 3.14* s*s);
}

public static void area ( double r)
{
	System.out.println("area of circle"+3.14* r*r);
	
}

public static void area ( int s , double r)
{
	
	System.out.println("perimeter of rectangle"+ 3.14 *s*r);
	
}
}


