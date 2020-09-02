package Loops;

import java.util.Scanner;
// programs checks the min and max values read from a user. The programs stops when the user enter a negative value.
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer; ");
        int n = input.nextInt();
        int max =  n;
        int min = n;

        while (true){
            System.out.println("Enter an integer: ");

               n = input.nextInt();

            if (n < 0){
                break;
            } else if (n > max) {
                max = n;
            } else if (n < min){
                min = n;
            }

        }
        System.out.println("Max is " + max +  ", Min is " + min);
    }
}
