package javaprograms;

import java.util.ArrayDeque;
import java.util.Deque;


public class DeQueDemo {

	public static void main(String[] args) {
		Deque<Character> deque=new ArrayDeque<Character>();
		deque.add('H');
		deque.add('M');
		deque.add('N');
		
		System.out.println(deque);
		deque.pollFirst();
		deque.addFirst('A');
		deque.addLast('Z');
		
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println(deque);

	}

}
