package Assignments.Day4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Client-Server application using sockets for network communication

public class ClaimServer {

	public static void main(String[] args) {
		int port=12345;
		try(ServerSocket serverSocket=new ServerSocket(port)){
			System.out.println("Server is listening oon port"+port);
			while(true) {
				new ClaimHandler(serverSocket.accept()).start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

class ClaimHandler extends Thread{
	Socket socket;
	public ClaimHandler(Socket socket) {
		this.socket=socket;
	}
	public void run() {
	   try(ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
		   ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream())){
		   Claim claim=(Claim) in.readObject();	
		   System.out.println("Received claim:"+claim.getid()+"of type"+claim.getType());
		   claim.process();
		   out.writeObject("Claim processed successfully");   
	   }catch(IOException | ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	}
}
	