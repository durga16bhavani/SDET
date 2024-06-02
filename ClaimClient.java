package Assignments.Day4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClaimClient {

	public static void main(String[] args) {
		String hostname="localhost";
		int port=12345;
		
		try (Socket socket=new Socket(hostname,port);
			 ObjectOutputStream out =new ObjectOutputStream(socket.getOutputStream());
			 ObjectInputStream in=new ObjectInputStream(socket.getInputStream())){
			 Claim claim=new HealthClaim(1,1000);
			 out.writeObject(claim);
			 String response=(String) in.readObject();
			 System.out.println(response);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
