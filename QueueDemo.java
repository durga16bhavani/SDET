package javaprograms;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Kabbadi");
		queue.add("Kho Kho");
		queue.add("Badminton");
		queue.add("Shooting");
		queue.add("Javalin throw");
		
		System.out.println(queue);
		
		System.out.println(queue.element());
		
		System.out.println(queue.poll());
		
		System.out.println(queue);

	}

}
