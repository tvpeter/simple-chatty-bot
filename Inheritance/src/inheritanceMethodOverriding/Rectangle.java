package inheritanceMethodOverriding;

public class Rectangle {
    protected double length;
    protected double width;
    protected double sides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setSides(double sides){
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am coming from the rectangle class");
    }
}
