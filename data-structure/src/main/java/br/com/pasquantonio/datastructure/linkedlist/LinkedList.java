package br.com.pasquantonio.datastructure.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList;

	public void insert(T data) {
		sizeOfList++;
		if (this.root == null) {
			this.root = new Node<T>(data);
		} else {
			insertAtTheBegining(data);
		}

	}

	// O(1)
	private void insertAtTheBegining(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}

	// O(N)
	private void insertAtTheEnd(T data, Node<T> node) {
		if(node.getNextNode() == null){
			node.setNextNode(new Node<T>(data));
		}else{
			insertAtTheEnd(data, node.getNextNode());
		}
	}

	public void remove(T data) {
		if(this.root == null){
			return;
		}
		
		this.sizeOfList--;
		if(this.root.getData().compareTo(data)==0){
			this.root = null;
		}else{
			remove(data,this.root,this.root.getNextNode());
		}
	}

	private void remove(T data, Node<T> previous, Node<T> actual) {
		while (actual!= null) {
			if(actual.getData().compareTo(data)==0){
				previous.setNextNode(actual.getNextNode());
				actual = null;
				return;
			}
			
			previous = actual;
			actual = actual.getNextNode();
			
		}
		
	}

	public void traverseList() {
		if(this.root == null){
			return;
		}

		Node<T> actualNode = this.root;
		while(actualNode != null){
			System.out.print(actualNode+" -> " );
			actualNode = actualNode.getNextNode();
		}
	}

	public int size() {
		return this.sizeOfList;
	}


}
