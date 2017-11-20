# data-structures
Study of data structures in java

## Array

- Simple data structure tha stores value identified by anindex.
- Store data of same type
- Index starts at zero
- Because of index, randon access is possible
- Array can be dinamic, size can be changed anytime
- MultidimensionalArrays can be useful, it can be used as an matrix, number[][]
- It can have as many dimensions as wanted, usually, it is used two dimensions

### Advantages
Randon access is possible, because of its index, it returns extremely fast O(1), getItem(index)
It should be used when we want to add itens, and get itens really fast, with it index
### Disadvantages
Size must be defined within compile time, if it reaches its limit, another array must be created with double of its size, and values are copied from one array to another, it is a slow operation, O(N)
Can only store itens from same type

### Operations

- add(item) - insert item at the end o the list, O(1)

- add(index,item) - in order to insert an item in a givem index, first it has to see if the index is occupied ( O(1) Complexty), then, if it is, it would move every item from this index foward, to the next index, disoccuping the desired index.
This opperation has linear time complexity, because it has to move the itens, O(N)

- removeLast - Removes the last index, O(1)

- remove(index) - Takes linear time complexity, because it has to swift itens to reconstruct the array O(N)

### Conclusion

Should use it to add or remove itens from the last index. Constant time complexty O(1)

Shouldn`t use to add or remove itens in a specific index. Linear time complexty O(N)

## Linked List

nodes pointing to another node, and the last node points to null

n1 -> n2 -> n3 -> null

A node contains two importante information, a data, that can be an int, string, object, and the reference to the next node
```
public class Node {
	int value;
	Node nextNode;
}
```
LinkedList can be used as stacks, ques, and many other data structures
Does not has randon access
many basic operations such as getting the last node, or finding one, must scan all or great part of the list

### Advantages

- Easy to implement
- Dinamic data structure (array are not)
- Grow organically, because it doesn t need to define the size of it in compilation time, or recreate it if it is full. Just update reference O(1)
- Remove is very fast once it only has to change the reference of the nextNode
- very efficient if want to manipulate the first elements. To add node in the beginin or remove from the beginin, it takes O(1)

### Disadvantages

- Need more space sice it stores the memory reference of the next node
- Needs to be iterated from the begining of the list, it does not has random access, it uses sequence access
- Cant iterate backwards, because it only stores the next node. In order to store the previous node, it must implement a double linked list, which stores the next and the previus node, the downside, is tha it wast more space to store both references


### Operations

### Insert

Insert at the beginin O(1)
Inserting atthe end O(N)

linkedList.insertAtStart(5)
To insert at the beginin, just insert the node, and set the reference to the next node
```
  n1(5) -> n2 (10) -> null
  
  To insert a node with value 3, just create it, and set reference to the n1(5), the structure would be like this
  
  n1(3) -> n2 (5) -> n3(10) -> null
```
Insertion in the begining of the list is O(1) complexity, while the array needs to swift all the elements, making space for the new first element, costing O(N) time complexity.
This operation is extremelly fast

linkedList.insertAtEnd(25)

```
  n1(12) -> n2(4) -> n3(7) -> n4(10) -> n5(2) -> null
  
  To insert a node with value 25, at the end, we must,
  	- find the last node O(N)
	- update reference O(1)
	
  
  n1(12) -> n2(4) -> n3(7) -> n4(10) -> n5(2) -> n6(25) -> null
```
To insert at the end of the linked list, we must iterate through all the list,O(N) , to find the last node node ( which next nod is null), and we also have to update the reference when we get there O(1).
So, O(N) + O(1) is O(N)

### Remove

Remove at the beginin O(1) time complexity
Remove at a given place the end O(N) complexity

linkedList.removeFirst()
Just remove the root node
```
n1(3) -> n2 (5) -> n3(10) -> null
  
To remove the first node with value 3, just remove it! O(1) time complexity
  
n1(5) -> n2 (10) -> null
```
Removing the first node is O(1) complexity

linkedList.remove(10)
Search through the list to find the node with value 10, when found, update the reference of the previous, to make it point to the node that node(10) whas pointing to.
```
iterate through the node and find node with value 10 O(N) time complexity
n1(3) -> n2 (5) -> n3(10) -> n4(16) -> null
remove n3 and update reference of n2
n1(3) -> n2(5) -> n4(16) -> null
```
### Conclusion

LinkedList are good for manipulating elements at the begining of the list. It does not has random acess, so it is not good to use it when we are not going to work if elements at the begining.

## Doubly LinkedList

It is a linkedList that stores the reference to the previousNode. Linked list can go from n1 to n3, but it canot go from n3 to n1, so, when we need it, we use Doubly LinkedList

### Advantages

Can iterate foward and backward

### Disadvantages

It is not memory friendly, once it has to store to references in wach node


## LinkedList vs Array

                            LinkedList                 Array
Search                          O(N)                    O(1)
Insert at the start             O(1)                    O(N)       
Insert at the end               O(N)                    O(1)
Memory space                    O(N)                    O
