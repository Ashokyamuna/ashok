package String;

public class c2 {

	public static void main(String[] args)
	{
		StringBuffer n= new StringBuffer("Welcome");
		
		System.out.println(n.append("hi"));
		System.out.println(n.insert(4,"d"));
		System.out.println(n.delete(7,9));
		System.out.println(n.substring(0,2));
	}

}
