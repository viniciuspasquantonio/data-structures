package br.com.pasquantonio.datastructure.binarySearchTree;

public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	
	public Node(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
	
	
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
