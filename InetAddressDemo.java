package javaprograms.Networking;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException{
		
		//remote
		InetAddress address=InetAddress.getByName("www.google.com");
		System.out.println("Host name:"+address.getHostName());
		System.out.println("Host Address:"+address.getHostAddress());
		
		//local
		InetAddress LocalAddress=InetAddress.getLocalHost();
		System.out.println("LocalHost name:"+LocalAddress.getHostName());
		System.out.println("LocalHost Address:"+address.getHostAddress());

	}

}
