package prac;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
//		Queue<Integer> queue = new PriorityQueue<>(); // Works as minheap
		Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // Works as maxheap
		queue.offer(40);
		queue.offer(15);
		queue.offer(30);
		queue.offer(45);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);

	}

}
