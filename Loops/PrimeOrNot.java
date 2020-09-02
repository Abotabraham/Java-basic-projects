package Loops;

import java.util.Scanner;
// program check if a given number is a prime number.
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = input.nextInt();
         for (int i = 2; i < N; i++){
             if (N % i == 0){
                 System.out.println("Not Prime!");
                 break;
             }
             System.out.println("Prime!");
         }

    }
}
