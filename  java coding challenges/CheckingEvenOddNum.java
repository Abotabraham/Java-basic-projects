package toDos;
import java.util.Scanner;

public class CheckingEvenOddNum {
	public static void main(String[] args) {
		
		int num;
		Scanner numUser = new Scanner(System.in);
		System.out.print("Enter your number: ");
		
		num = numUser.nextInt();
		numUser.close();
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}
	}

}
