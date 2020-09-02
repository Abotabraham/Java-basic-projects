package Loops;

import java.util.Scanner;
// the program displays the sum of the digits of a number entered the user.
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer : ");
         int n = input.nextInt();
        int sum = 0;
         while( n > 0) {
             sum += n%10; // extract the last digit and add to sum
             n /= 10; // get rid of the last digit
         }

         System.out.println("The sum of the digits of the entered integer is " + sum);
    }
}
