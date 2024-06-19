package javaDesignPatterns_Programs;

import java.util.List;
import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Hello");
		//list.add(123);//no error
		
		for(Object obj:list) {
			String str=(String) obj;
			System.out.println(str);
		}

	}

}

