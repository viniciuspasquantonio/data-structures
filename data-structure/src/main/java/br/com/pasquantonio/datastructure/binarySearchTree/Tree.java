package br.com.pasquantonio.datastructure.binarySearchTree;

public interface Tree<T extends Comparable<T>> {

	public void traversal();
	public void insert(T data);
	public void remove(T data);
	public T getMax();
	public T getMin();
}
