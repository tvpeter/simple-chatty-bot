package com.company;

public class Rectangle {

    private double length;
    private double width;

    /**
     * Default constructor
     */
    public Rectangle(){
        length = 0;
        width = 0;
    }

    /**
     * Initializing variables using constructor
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    /**
     * Calculate the area of a rectangle
     */

    protected double rectangleArea ()
    {
        return this.width * this.length;
    }

    /**
     * perimeter of rectangle
     */

    protected double rectanglePerimeter(){
        return (2 * length) + (2 * width);
    }
}
