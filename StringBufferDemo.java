package javaprograms;

public class StringBufferDemo {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("hello");
		/*
		sb.append("java");
		System.out.println(sb);	
		System.out.println(sb.reverse());	
		*/
		for(int i=0;i<1000000;i++) {
			sb.append("World");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
		
		long Time=System.currentTimeMillis();
		StringBuilder s=new StringBuilder("hello");
		
		for(int i=0;i<1000000;i++) {
			s.append("World");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-Time)+"ms");

	}

}
