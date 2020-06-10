package com.company;

public class Main {

    public static void main(String[] args) {
        /***********************
         * Instantiate the rectangle object using the default constructor
         */

        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(54);

        double room1Area = room1.rectangleArea();
        double room1Perimeter = room1.rectanglePerimeter();

        /********************
         * Instantiate the rectangle object special constructor
         */

        Rectangle room2 = new Rectangle(45, 34);
        double room2Area = room2.rectangleArea();
        double room2Perimeter = room2.rectanglePerimeter();

        System.out.println("The combined area is " + room1Area + room2Area);
        System.out.println("The combined perimeter is " + room1Perimeter + room2Perimeter);

    }
}
