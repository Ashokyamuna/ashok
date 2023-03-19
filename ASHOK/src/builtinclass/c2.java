package builtinclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class c2 {

	public static void main(String[] args) throws IOException 
	
	{
		File f = new File("C:\\Users\\ashok\\eclipse-workspace\\ASHOK\\src\\builtinclass\\ashok.txt");
		FileReader  fr =new FileReader(f);
		BufferedReader br =new BufferedReader (fr);
		String line ;
		while ((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		
		
	}

}
