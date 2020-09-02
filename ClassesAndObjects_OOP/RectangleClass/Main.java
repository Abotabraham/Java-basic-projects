package ClassesAndObjects_OOP.RectangleClass;

import java.util.Scanner;

public class Main {


        public static void main(String[] args){
            Rectangle [] R1 = new Rectangle[3]; // declaring an array object
            Scanner input = new Scanner(System.in); // the scanner object;

            //************** looping through and initializing the array object ****/
            for (int i = 0; i < R1.length; i++) {

                System.out.print("Do you want to enter the height " +
                        "and width of three rectangles: y / n ");
                char choice = input.next().charAt(0); // yes (y) or no (n)
                if (choice =='y'){
                    System.out.print("Enter width and height: ");
                    R1[i] = new Rectangle(input.nextDouble(), input.nextDouble());
                } else if (choice == 'n') {
                    R1[i] = new Rectangle();
                } else {
                    System.out.println("Invalid choice! Try again.");
                }
            }
            //************** Printing the height, width, area, and perimeter of rectangles ****/
            System.out.println("The rectangles are:");
            for (int i = 0; i < R1.length; i++){
                System.out.println("Rectangle " + (i + 1) + " : width is : " + R1[i].getWidth() +
                        " height is :" + R1[i].getHeight());
                System.out.println("Rectangle " + (i + 1) + " : Area is " + R1[i].getArea());
                System.out.println("Rectangle " + (i + 1) + " : Perimeter is " + R1[i].getPerimeter());
            }
        }
    }


