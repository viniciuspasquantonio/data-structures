package br.com.pasquantonio.datastructure.binarySearchTree;

public class App {

	public static void main(String[] args) {
		Tree<Integer> binarySortedTree = new BinarySortedTree<Integer>();
		binarySortedTree.insert(4);
		binarySortedTree.insert(1);
		binarySortedTree.insert(8);
		binarySortedTree.insert(7);
		binarySortedTree.insert(200);
		binarySortedTree.insert(57);
		binarySortedTree.insert(0);
		
		binarySortedTree.remove(0);
		
		System.out.println("Min: "+ binarySortedTree.getMin());
		System.out.println("Max: "+ binarySortedTree.getMax());
		binarySortedTree.traversal();
	}
}
