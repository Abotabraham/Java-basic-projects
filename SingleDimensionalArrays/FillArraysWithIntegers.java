package SingleDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
// The program fill an arrays from the values enter by the user.
public class FillArraysWithIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? (min =1 and Max = 20: ");
        int n = input.nextInt(); // n is the size of the arrays

        while (n > 20 || n < 0) {
            System.out.println("Invalid number. Try again!");
            n = input.nextInt();
        }
        int [] numbers = new int [n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[] numbers) {
        // print the array
        System.out.print("The elements are : ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers) {

        Scanner input = new Scanner(System.in);
// filling the array with values enter by the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the numbers: ");
            numbers[i] = input.nextInt();
        }
    }


}
