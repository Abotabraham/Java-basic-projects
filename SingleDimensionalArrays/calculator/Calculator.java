package SingleDimensionalArrays.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // read the input from the user

        System.out.print("Enter num1 operator num2 (5 + 8): ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        char opp = input.next().charAt(0);
        int num2 = input.nextInt();

        if (opp == '+'){
            System.out.println(num1+num2);
        } else if (opp == '-'){
            System.out.println(num1-num2);
        } else if (opp == '*'){
            System.out.println(num1*num2);
        } else if (opp == '/'){
            System.out.println(num1/num2);
        } else {
            System.out.println("Invalid Operator or number. Try again!");
        }

    }
}
