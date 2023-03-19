package builtinclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class c7 {

	
		

			public static void main(String[] args) throws IOException 
			{
				File f = new File ("C:\\Users\\ashok\\eclipse-workspace\\ASHOK\\src\\builtinclass\\yamuna.txt");
		        FileWriter fw =new FileWriter(f);
		        BufferedWriter bw= new BufferedWriter(fw);
		        bw.write("hi");
		        bw.newLine();
		        bw.write("hello");
		        bw.close();
		        
			}

		

}
