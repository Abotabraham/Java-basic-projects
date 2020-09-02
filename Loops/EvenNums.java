package Loops;
// Program prints all even numbers between 1 and 100 in increasing order
public class EvenNums {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }
    }
}
