package br.com.pasquantonio.datastructure.arrays;

public class Introduction {

	public static void main(String[] args) {
		//must define size of array in compilation time
		//specify the type of the array
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			// O(1)
			nums[i] = i; 
			
		}
		// O(1) random access 
		int num = nums[0];
		
		// O(N) linear search, because iterate through all the numbers
		// --> binary search O(logN) --> hashtables O(1)
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 4){
				System.out.println("Index found "+ i);
			}
		}
		
		try {
			//throws exception because array has only 5 spaces, 0 1 2 3 4 
			int outOfBoundsNum = nums[5];
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			//throws exception because array has only 5 spaces, 0 1 2 3 4
			// in order to add number at index 5, should create a new array with 6 index, coping numbers for the new array, O(N) 
			nums[5] = 5;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
