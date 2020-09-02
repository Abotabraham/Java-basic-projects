package SingleDimensionalArrays;
// The program compute the sum, product, and average of values in an array
public class SumProductAverageOfArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, -3, 5, 7};

        int sum = 0;
        int product = 1;
        double average;

        for (int number : numbers) {
            sum = sum + number;
            product = product * number;
        }

        average = (double)sum/ numbers.length;

        System.out.println("The Sum is " + sum);
        System.out.println("The Product is " + product);
        System.out.println("The Average is " + average);
    }
}
