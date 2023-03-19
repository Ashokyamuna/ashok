package exception;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) throws Exception 
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
	    int age =s.nextInt();
		if (age>18)
		{
			System.out.println("Major");
			
		}
		else 
		{
			throw new Exception("cannot vote");
			
		}
	}

}
