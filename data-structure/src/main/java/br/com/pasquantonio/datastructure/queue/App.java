package br.com.pasquantonio.datastructure.queue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(2);
		queue.enqueue(6);
		System.out.println(""+queue.peek());
		System.out.println(queue.size());
	}
}
