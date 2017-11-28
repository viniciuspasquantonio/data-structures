package br.com.pasquantonio.datastructure.queue;

import br.com.pasquantonio.datastructure.linkedlist.Node;

public class Queue<T extends Comparable<T>> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	private boolean isEmpty(){
		return this.firstNode == null;
	}
	
	public int size(){
		return count;
	}
	public void enqueue(T data){
		count++;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		if(isEmpty()){
			this.firstNode = this.lastNode;
		}else{
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue(){
		if(isEmpty()){
			this.lastNode = null;
			return null;
		}
		count--;
		T data = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		return data;
	}
	
	public T peek(){
		count--;
		if(isEmpty()) return null;
		return this.firstNode.getData();
	}
}
