package Loops;

import java.util.Scanner;

public class DisplayPattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a position number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= n; j++){

                System.out.print("*");
            }
            System.out.println();
        }
     }
}
