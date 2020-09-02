package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

         System.out.print("Enter 5 integers: ");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();
            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }

        Collections.sort(integers);

        System.out.println("The sorted-unique arraylist: " + integers);
    }
}
