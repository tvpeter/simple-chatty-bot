public class TestShape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);

        rectangle.printShape();
        double area = rectangle.calculateArea();

        System.out.println("The given rectangle has an area of "+area);
    }
}
