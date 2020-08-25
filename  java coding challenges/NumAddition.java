package toDos;
import java.util.Scanner;

public class NumAddition {
	
public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		
		num1 = scan.nextInt();
		
		System.out.print("Enter the Second number: ");
		
		num2 = scan.nextInt();
		
		scan.close();
		
	    sum = num1+ num2;
	    
	    
	    System.out.println("The sume of these two numbers is: " + sum);
		

	}


}
 


 

 

	
