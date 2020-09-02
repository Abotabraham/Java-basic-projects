package TwoDimensionalArrays;

public class SumOf2DRow {
    public static void main(String[] args) {
        int [] [] integers = {
                {1,2,3,4},
                {5,6,7,8},
                 {9,10,11,12}
        };

        int sumOfEachRow = 0;

        for (int i = 0; i < integers.length; i++) {
            sumOfEachRow = 0;
            for (int j = 0; j < integers[i].length; j++) {
                sumOfEachRow = sumOfEachRow + integers[i][j];
            }

            System.out.println("The sum of row " + (i +1) + " is :" + sumOfEachRow);
        }
    }
}
