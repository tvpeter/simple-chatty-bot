package inheritanceMethodOverriding;

public class OverrideTesterClass {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //overloaded print method
        rectangle.print();

        Square square = new Square();
        // overloaded print method
        square.print("Square class");
    }
}


