package javaprograms.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws Exception {
		FileReader myFile=new FileReader("C:/Users/Administrator/Documents/File-handling/File1.txt");
		BufferedReader br=new BufferedReader(myFile);
		
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
		myFile.close();

	}

}
