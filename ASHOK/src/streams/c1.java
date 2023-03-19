package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c1 {

	public static void main(String[] args)
	{
		
	
	    List<Integer> number = Arrays.asList(2,3,4,5,10);
	    List<Integer> square = number.stream().map(x -> x+9).
	                           collect(Collectors.toList());
	    System.out.println(square);
	    
	    
	        
	    List<String> names = Arrays.asList("kirthika","dhivya","deepa","deepika","sowmiya");
  
    // demonstration of filter method
     List<String> result = names.stream().filter(s->s.startsWith("s")).
                          collect(Collectors.toList());
    System.out.println(result);
    
    
      //SORTED
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(show);

    List<Integer> number1 = Arrays.asList(2,3,8,10,12);
    int ADDITIONOFodd =
    	       number1.stream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i);
    	  
    	    System.out.println(ADDITIONOFodd);
    	    
    	    int ADDITIONOFeven =
    	    	       number1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    	    	  
    	    	    System.out.println(ADDITIONOFeven);
    	    
    	    
    	int s=    number1.stream().filter(x->x>6).reduce(0,(ans,i)-> ans+i);
      	  
    	    System.out.println(s);

	}

}

