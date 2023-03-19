package overloading;

public class c3 {

	public static void main(String[] args)
	{
		

    c3 ob = new c3();
	c3 ob1= new c3 ();
	c3 ob2= new c3 (5);
	c3 ob3= new c3 (6.4);
	c3 ob4 = new c3( 5,10.5);
	 
	}
	public c3 ()
		{
			System.out.println("area");
		}
		
		public c3 (int s)
		{
			System.out.println( "perimeter of square"+ 3.14* s*s);
		}
		
		public c3 ( double r)
		{
			System.out.println("area of circle"+3.14* r*r);
			
		}

		public c3 ( int s , double r)
		{
			
			System.out.println("perimeter of rectangle"+ 3.14 *s*r);
			
		}
	}



