package javaprograms.FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {

	public static void main(String[] args) throws Exception {
		FileWriter myFile=new FileWriter("C:/Users/Administrator/Documents/File-handling/File2.txt");
		BufferedWriter bw=new BufferedWriter(myFile);
		bw.write("Write to file by using buffered writer.");
		bw.close();
		System.out.println("Written Successfully");		
	   
	}

}
