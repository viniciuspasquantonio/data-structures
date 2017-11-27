package br.com.pasquantonio.datastructure.stackLinkedlist;

public class App {
	public static void main(String[] args) {
		StackLinkedList<Integer> stackLinkedList = new StackLinkedList<Integer>();
		stackLinkedList.push(10);
		stackLinkedList.push(30);
		stackLinkedList.push(20);
		System.out.println(stackLinkedList.getSize());
		System.out.println("pop "+stackLinkedList.pop());
		System.out.println("peek "+stackLinkedList.peek());
		System.out.println("pop "+stackLinkedList.pop());
		System.out.println("peek "+stackLinkedList.peek());
		System.out.println("size "+stackLinkedList.getSize());
		
	}
}
