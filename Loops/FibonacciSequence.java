package Loops;

import java.util.Scanner;
// the program displays the nth fibonacci number
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        for (int i = 1; i <= n-2; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.println("The nth fibonacci sequence is " + num3);
    }
}
