package br.com.pasquantonio.datastructure.stackLinkedlist;

import br.com.pasquantonio.datastructure.linkedlist.Node;

public class StackLinkedList<T extends Comparable<T>> {

	private Node<T> root;
	
	private int size;
	
	//O(1)
	public void push(T data){
		this.size++;
		if(this.root == null){
			this.root = new Node<T>(data);
		}else{
			Node<T> oldRoot = this.root;
			this.root = new Node<T>(data);
			this.root.setNextNode(oldRoot);
		}
	}
	
	//O(1)
	public T peek(){
		return this.root.getData();
	}
	
	//O(1)
	public T pop(){
		this.size--;
		Node<T> oldRoot = this.root;
		this.root = this.root.getNextNode();
		return oldRoot.getData();
	}

	public int getSize() {
		return size;
	}

}
