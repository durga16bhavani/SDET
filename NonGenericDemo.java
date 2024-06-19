package javaDesignPatterns_Programs;

import java.awt.List;
import java.util.ArrayList;

public class NonGenericDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Hello");
		list.add(123);//no error
		
		for(Object obj:list) {
			String str=(String)obj;
			System.out.println(str);
		}

	}

}
