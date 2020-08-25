package toDos;

import java.util.Arrays;

public class OddBeforeEvenArray {

	public static void main(String[] args) {
		  int [] fillArray = new int [5];
		 int [] numbers = {11, 2, 4, 5, 7, 9, 13, 30, 3, 33, 43, 8 };
		 int [] orderedArray = {2, 4, 5, 7, 9, -2, 3, 16, 3, 5, 800, 69, 17};
		 int [] orderedArrayCopy = {2, 4, 5, 7, 9, -2, 3, 16, 3, 5, 800, 69, 17};
		 int [] temp  = new int [numbers.length];
		 int j = 0;
		  
		 int count = 0;
		 
		 
		 
		 for (int num =0 ; num < numbers.length; ) {
			 
			 if (numbers[num] % 2 != 0) {
				 if(numbers[num]!= 0) {
					 count++;
					 temp[j++] = numbers[num];
					 
				 }
				 
			 }   
			 num++;
			} 
		 for (int i = 0; i < numbers.length; i++) {
			 if (numbers[i] % 2 == 0) {
				 temp[count++] = numbers[i];
			 }   
			 
		 }
		 System.out.println(Arrays.toString(temp));
		 System.out.println("Below is the return array:");
		  System.out.println( Arrays.toString(copyArray(temp, numbers)));
		  System.out.println("Below is the sorted array:");
		  System.out.println(Arrays.toString(sortedArray(orderedArray)));
		  System.out.println("Below is the index of binarSearch() array:");
		  System.out.println(Arrays.binarySearch(orderedArray, 19));
		  System.out.println("Below is the equality comparison of arrays:");
		  System.out.println(Arrays.equals(orderedArray, orderedArrayCopy));
		  System.out.println("Below is the fill method test array:");
		  Arrays.fill(fillArray, 5);
		  System.out.println(Arrays.toString(fillArray));
	}

	private static int [] sortedArray(int[] orderedArray) {
		 Arrays.sort(orderedArray);
		 return orderedArray;
		
	}

	private static int [] copyArray(int [] temp, int [] numbers) {
		 for (int i = 0; i < temp.length; i++) {
			 numbers[i] = temp[i];
			 
		 } 
		 return numbers;
		
	}

}
