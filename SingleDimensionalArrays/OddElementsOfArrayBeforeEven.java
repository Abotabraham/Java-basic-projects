package SingleDimensionalArrays;

import java.util.Arrays;
// the program put the odd numbers first then even numbers later in the array
public class OddElementsOfArrayBeforeEven {
    public static void main(String[] args) {
        int [] numberArray = {1,6,8,50,2,3,4,5,9,3,-5};
        int [] temporaryArray = new int [numberArray.length];

        int j = 0;
        int k = numberArray.length-1;


        for (int i = 0; i < numberArray.length; i++)
            // copy values into the temp array
             if (numberArray[i] % 2 != 0)
                 temporaryArray[j++] = numberArray[i];
             else
                 temporaryArray[k--] = numberArray[i];


     copyTemporaryArrayToNumberArray (numberArray, temporaryArray);
     System.out.println("The modified Array: " + Arrays.toString(numberArray));

    }

    private static void copyTemporaryArrayToNumberArray(int[] numberArray, int[] temporaryArray) {

        for (int i = 0; i < temporaryArray.length; i++)
            numberArray[i] = temporaryArray[i]; // copy the values in the temp array into the original array
    }
}
