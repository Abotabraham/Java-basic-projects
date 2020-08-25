package toDos;

import java.util.Scanner;

public class IsLeapYear {
public static void main(String[] args) {
		
		
		Scanner yearUser = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		
		int year = yearUser.nextInt();
		boolean isLeap = false;
		yearUser.close();
		
	 if (year %4==0) {
		 if (year % 100 == 0) {
			 if (year % 400 == 0) {
				 isLeap = true;
			 } else {
				 isLeap = false;
			 }
			 
		 } else {
			 isLeap = true;
		 }
		 
	 } else {
		 isLeap = false;
	 }
	 
	 if (isLeap == true) {
		 System.out.println(year + " is a leap year.");
	 } else {
		 System.out.println(year + " is not a leap year.");
	 }
		
	}


}
