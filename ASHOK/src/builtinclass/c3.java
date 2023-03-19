package builtinclass;

import java.util.ArrayList;
import java.util.Iterator;

public class c3 {
  public static void main(String[] args) {
    ArrayList<Character> charList = new ArrayList<Character>();

    // Add elements to the list
    charList.add('a');
    charList.add('b');
    charList.add('c');
    charList.add('d');
    charList.remove(1);

    char retrieved = charList.get(2);
    System.out.println("Retrieved element: " + retrieved);

  
    Iterator<Character> iterator = charList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}



	


