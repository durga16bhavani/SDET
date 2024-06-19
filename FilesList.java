package javaprograms.FileHandling;
import java.io.File;

public class FilesList {

	public static void main(String[] args) {
		File dir=new File("C:/Users/Administrator/Documents/File-handling");
		File[] fileslist=dir.listFiles();
		if(fileslist!=null) {
			for(File file:fileslist) {
				System.out.println(file.getName());
			}
		}else {
			System.out.println("Directory does not exists.");
		}
	}
}
