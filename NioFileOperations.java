package javaprograms.FileHandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileOperations {

	public static void main(String[] args) {
		
		// create and write into file
	    Path path=Paths.get("C:/Users/Administrator/Documents/File-handling/File3.txt");
	    String content="We are learning nio.";
	    try {
	    	Files.write(path,content.getBytes());
	    	System.out.println("File written:"+path);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    //read from file
	    String fileContent;
	    try {
	    	fileContent=Files.readString(path);
	    	System.out.println("File content:"+fileContent);
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	}

}
