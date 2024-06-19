package javaprograms.FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile file=new RandomAccessFile("C:/Users/Administrator/Documents/File-handling/File2.txt","rw");
			
			file.writeUTF("Hello,random access file!We are writing into file.");
			
			//move the file pointer to position 20
			file.seek(20);
			//Write data at 20th position
			file.writeUTF("More data here");
			//Move the file pointer to the beginning
			file.seek(0);
			//Read data from the beginning
			String content=file.readUTF();
			System.out.println("Content:"+content);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}		

	}

}
