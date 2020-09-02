package SingleDimensionalArrays;
// the program displays the max and min value in an array.
public class MaxMinOfArray {
    public static void main(String[] args) {
        int [] intArray = {3,2,1,5,4, -5, 10, 90, 40, 60};
        int max = intArray[0];
        int min = intArray[0];

        for (int i = 1; i < intArray.length; i++) {

            max = intArray[i] > max ? intArray[i] : max;
            min = intArray[i] < min ? intArray[i] : min;
        }
        System.out.println("The max is : " + max);
        System.out.println("The min is : " + min);

    }
}
