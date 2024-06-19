package javaprograms.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("C:/Users/Administrator/Documents/File-handling/File1.txt");
			myWriter.write("Files in java might be tricky, but it is very important to learn.");
			myWriter.write("\nWe can write into file by using FileWriter");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
