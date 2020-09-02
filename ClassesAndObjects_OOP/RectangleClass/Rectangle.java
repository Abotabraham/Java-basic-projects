package ClassesAndObjects_OOP.RectangleClass;

public class Rectangle {



        /// field or attribute for the rectangle
        private double height;
        private double width;

        // default constructor
        public Rectangle () {
            this ( 1, 1); // call the constructor below
        }
        public Rectangle (double height, double width) {
            this.height = height;
            this.width = width;
        }
        /************ getter and setter for height ******/
        public double getHeight () {
            return this.height;
        }
        public void setHeight (double height) {
            this.height = height;
        }
        /************** getter and setter for width ****/
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }
        /************** get the area of rectangle ****/
        public double getArea() {
            return height * width;
        }
        /************** get the perimeter of rectangle ****/
        public double getPerimeter () {
            return 2*(height + width);
        }
    }


