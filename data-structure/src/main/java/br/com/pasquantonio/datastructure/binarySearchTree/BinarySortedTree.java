package br.com.pasquantonio.datastructure.binarySearchTree;

public class BinarySortedTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;
	private int count;
	
	public int size(){
		return count;
	}; 
	
	private boolean isEmpty() {
		return root == null;
	}

	
	public void traversal() {
		if(this.root != null){
			inOrderTraversal(this.root);
		}
	}

	private void inOrderTraversal(Node<T> node) {
		if(node.getLeftChild() != null){
			inOrderTraversal(node.getLeftChild());
		}
		System.out.println(node);
		if(node.getRightChild() != null){
			inOrderTraversal(node.getRightChild());
		}
	}

	public void insert(T data) {
		count++;
		if(isEmpty()){
			this.root = new Node<T>(data);
		}else{
			insert(data,this.root);
		}
		
	}

	
	public void remove(T data) {
		if(this.root == null) {
			return;
		}
		
		remove(data,this.root);
		
		
	}


	private Node<T> remove(T data, Node<T> node) {
		if(node == null){
			return null;
		}
		if(data.compareTo(node.getData()) < 0){
			node.setLeftChild(remove(data, node.getLeftChild()));
		}else if(data.compareTo(node.getData()) > 0){
			node.setRightChild(remove(data, node.getRightChild()));
		}else {
			if(node.getLeftChild() == null && node.getRightChild() == null){
				System.out.println("Removing a leaf node...");
				return null;
			}
			if(node.getRightChild() == null){
				System.out.println("Removing the left child");
				Node<T> auxNode = node.getLeftChild();
				node= null;
				return auxNode;
			}else if(node.getLeftChild() == null){
				System.out.println("Removing the right child");
				Node<T> auxNode = node.getRightChild();
				node= null;
				return auxNode;
			}
			
			System.out.println("Removing node with two childreen...");
			Node<T> auxNode = getPredecessor(node.getLeftChild());
			node.setData(auxNode.getData());
			node.setLeftChild(remove(auxNode.getData(), auxNode.getLeftChild()));
		}
			
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightChild()!=null){
			return getPredecessor(node.getRightChild());
		}
		System.out.println("Predecessor is: "+node);
		return node;
	}

	private void insert(T data, Node<T> node) {
		if(data.compareTo(node.getData()) < 0){
			if(node.getLeftChild() == null){
				node.setLeftChild(new Node<T>(data));
			}else{
				insert(data,node.getLeftChild());
			}
		}else{
			if(node.getRightChild() == null){
				node.setRightChild(new Node<T>(data));
			}else{
				insert(data,node.getRightChild());
			}
		}
		
	}

	public T getMax(){
		if(this.root == null){
			return null;
		}else{
			return getMax(this.root);
		}
	}
	
	public T getMin(){
		if(this.root == null){
			return null;
		}else{
			return getMin(this.root);
		}
	}
	
	private T getMax(Node<T> node) {
		if(node.getRightChild() == null){
			return node.getData();
		}else{
			return getMax(node.getRightChild());
		}
	}

	
	private T getMin(Node<T> node) {
		if(node.getLeftChild() == null){
			return node.getData();
		}else{
			return getMin(node.getLeftChild());
		}
	}

}
