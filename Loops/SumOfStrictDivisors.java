package Loops;

import java.util.Scanner;
// program displays the sum of strict divisors read from a user
public class SumOfStrictDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int numEntered = input.nextInt();
        int sumOfStrictDivisors = 1;
        for (int i = 2; i <numEntered; i++ ){
            if (numEntered % i == 0){
                sumOfStrictDivisors += i;
            }
        }
        System.out.println("The sum of strict divisors of the number entered is " + sumOfStrictDivisors);
    }
}
