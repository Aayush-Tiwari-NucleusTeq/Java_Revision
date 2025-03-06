package prac;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		// Can be used as stack with peekLast and pollLast property
		ArrayDeque<Integer> addqueue = new ArrayDeque<>();
		addqueue.offer(15);
		addqueue.offerFirst(50);
		addqueue.offer(30);
		addqueue.offer(45);
		addqueue.offerLast(70);
		addqueue.offerFirst(5000);
		
		System.out.println(addqueue);
		System.out.println(addqueue.peek());
		System.out.println(addqueue.peekFirst());
		System.out.println(addqueue.peekLast());
		System.out.println(addqueue.poll());
		System.out.println(addqueue);
		System.out.println(addqueue.pollFirst());
		System.out.println(addqueue);
		System.out.println(addqueue.pollLast());
		System.out.println(addqueue);
	}

}
