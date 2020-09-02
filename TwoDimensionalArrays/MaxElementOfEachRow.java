package TwoDimensionalArrays;

public class MaxElementOfEachRow {
    public static void main(String[] args) {
        int [][] numbers = {
                {1,10,3,8},
                {9, 12, 6, 7},
                {5,2,11,4}
        };

        for (int i = 0; i < numbers.length; i++){
            int max = numbers[i][0];
            for (int j = 0; j < numbers[i].length; j++){

                max = (numbers[i][j] > max) ? numbers[i][j] : max;

            }

            System.out.println("Max of Row " + (i + 1) + " : " + max);
        }
    }
}
