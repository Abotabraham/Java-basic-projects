package toDos;

import java.util.ArrayList;
import java.util.Scanner;

public class UserValues {

	public static void main(String[] args) {
		 ArrayList <Integer> numbers = new ArrayList<>();
		 System.out.print("Enter 10 numbers: ");
		
		 Scanner s = new Scanner(System.in);
	 
		 for (int i = 0; i < 5; i++) {
			 int userNum = s.nextInt();
			 if (!numbers.contains(userNum)) {
				numbers.add(userNum); 
			 } 
			  
			 }
			 //
		 //
			System.out.println(numbers);
		 }
			   
	}
