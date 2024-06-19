package javaprograms.FileHandling;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClearContent2 {

	public static void main(String[] args) throws IOException {
		try(RandomAccessFile raf=new RandomAccessFile("C:/Users/Administrator/Documents/File-handling/File2.txt","rw")){
			raf.setLength(0);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
