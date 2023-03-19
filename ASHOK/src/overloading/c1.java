package overloading;

public class c1 {

	public static void main(String[] args)
	{
		
	
	 c1 ob = new  c1();
	 ob.area();
	 ob.area(5);
	 ob.area (6.4);
	 ob.area( 5,10.5);
	 
	}
	public void area()
		{
			System.out.println("area");
		}
		
		public void area (int s)
		{
			System.out.println( "perimeter of square"+ 3.14* s*s);
		}
		
		public void area ( double r)
		{
			System.out.println("area of circle"+3.14* r*r);
			
		}

		public void area ( int s , double r)
		{
			
			System.out.println("perimeter of rectangle"+ 3.14 *s*r);
			
		}
	}





