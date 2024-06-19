package javaprograms.Networking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.google.com");//url object create
			//open the connection
			URLConnection connection=url.openConnection();
			//Get the input stream of the connection
			BufferedReader in =new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			//read and print the content of the url
			
			while((inputLine=in.readLine())!=null) {
				System.out.println(inputLine);
			}
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
