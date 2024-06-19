package javaprograms.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClearContent {

	public static void main(String[] args) {
		try {
			
		   FileWriter myFile=new FileWriter("C:/Users/Administrator/Documents/File-handling/File2.txt");
		   PrintWriter pw=new PrintWriter(myFile,false);
		   pw.flush();
		   pw.close();
		   myFile.close();
	  }catch(IOException e) {
		  System.out.println("Exception caught.");
		  e.printStackTrace();
	  }
	}

}
