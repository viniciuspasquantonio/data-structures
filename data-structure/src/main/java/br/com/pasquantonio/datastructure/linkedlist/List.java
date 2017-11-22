package br.com.pasquantonio.datastructure.linkedlist;

public interface List<T> {
	public void insert(T data);
	public void remove(T data);
	public void tranverseList();
	public int size();
}
