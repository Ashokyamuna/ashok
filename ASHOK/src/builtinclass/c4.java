package builtinclass;


		import java.io.File;
		import java.io.FileWriter;
		import java.io.BufferedWriter;
		import java.io.IOException;

		public class c4 {
		  public static void main(String[] args) {
		  
		    File file = new File("example.txt");

		    try {
		      
		      FileWriter fw = new FileWriter(file);
		      BufferedWriter bw = new BufferedWriter(fw);

		     
		      bw.write("Hello, this is a sample text.");
		      bw.newLine();
		      bw.write("This is the second line.");

		      
		      bw.close();
		      System.out.println("File written successfully!");
		    } catch (IOException e) 
		    {
		      System.out.println("An error occurred while writing to the file.");
		      e.printStackTrace();
		    }
		  }
		


	}


