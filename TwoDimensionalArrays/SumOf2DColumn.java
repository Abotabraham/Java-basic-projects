package TwoDimensionalArrays;
// the program prints the sum of column of a 2D array
public class SumOf2DColumn {
    public static void main(String[] args) {
        int [] [] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int sumOfEachColumn = 0;

        for (int i = 0; i < 4; i++) {
            sumOfEachColumn = 0;
            for (int j = 0; j < 3; j++) {
                sumOfEachColumn = sumOfEachColumn + integers[j][i];
            }

            System.out.println("The sum of row " + (i+1) + " is :" + sumOfEachColumn);
        }
    }
}
