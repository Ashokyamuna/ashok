package lambda;

public class c2 {

	public static void main(String[] args) 
	{
		String n="dhivya"  ;
	    
	    //with lambda // no parameter  
	    c1 c2=()->{  
	        System.out.println("Hello "+ n);  
	    };  
	    // calling method of interface D1 using its interface instance 
	    c2.pt();
	    String s="dhivya"  ;
	    
	    //with lambda // no parameter  
	    c1 d2=()->{  
	        System.out.println("Hello "+ n);  
	    };  
	    // calling method of interface D1 using its interface instance 
	    d2.pt();
	// Lambda expression with single parameter.  
	    d2 s1=(side)->{  
	        System.out.println("area of square is "+ side*side); 
	    };  
	   s1.sqaure(40);
	   
	 //Lambda expression with two parameter.  
	  d3 ad1=(a, b)->(a+b);  
	    System.out.println(ad1.add(10,20));



	}

}
