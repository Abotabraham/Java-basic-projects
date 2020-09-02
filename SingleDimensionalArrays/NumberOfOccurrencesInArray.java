package SingleDimensionalArrays;

public class NumberOfOccurrencesInArray {
    public static void main(String[] args) {
        int [] numbers = {1,1,1, 2,3,4};
        int searchElement = 1;
        int count = 0;

        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                count++;
            }
        }

     if (count>1)
          System.out.println("The search element occurs " + count + " times.");
     else
        System.out.println("The Search element occurs " + count + " time.");
    }
}
