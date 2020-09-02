package Loops;

import java.util.Scanner;
// the program displays the sum of  sequence of integers read from a user
public class SumLess100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a sequence of integers: ");
            sum = sum + input.nextInt();

            if ( sum >= 100){
                break;
            }
        }

        System.out.println( "The sum is " + sum + ". Done !");
    }
}
