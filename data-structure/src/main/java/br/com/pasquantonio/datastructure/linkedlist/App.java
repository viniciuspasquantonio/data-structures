package br.com.pasquantonio.datastructure.linkedlist;

public class App {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.insert(10);
		list.insert(3);
		list.insert(6);
		list.insert(1);
		list.insert(27);
		System.out.println(list.size());
		list.remove(10);
		System.out.println(list.size());
		
		list.traverseList();
	}
}
