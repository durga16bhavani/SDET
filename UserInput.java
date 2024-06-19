package javaprograms.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {
		String name;
		System.out.println("Please type your name and press Enter.");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try {
			name=reader.readLine();
			
			System.out.println("Hello, "+name+"!");
		}catch(IOException e) {
			System.out.println("An error occured:"+e.getMessage());
		}

	}

}
