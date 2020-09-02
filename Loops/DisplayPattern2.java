package Loops;

import java.util.Scanner;

public class DisplayPattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i*2-1; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
