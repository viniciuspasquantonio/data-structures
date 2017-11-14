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

add(item) - insert item at the end o the list, O(1)
add(index,item) - in order to insert an item in a givem index, first it has to see if the index is occupied ( O(1) Complexty), then, if it is, it would move every item from this index foward, to the next index, disoccuping the desired index.
This opperation has linear time complexity, because it has to move the itens, O(N)
removeLast - Removes the last index, O(1)
remove(index) - Takes linear time complexity, because it has to swift itens to reconstruct the array O(N)

### Conclusion

Should use it to add or remove itens from the last index. Constant time complexty O(1)
Shouldn`t use to add or remove itens in a specific index. Linear time complexty O(N)
    
