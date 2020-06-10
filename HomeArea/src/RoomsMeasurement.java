import java.util.Scanner;

public class RoomsMeasurement {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RoomsMeasurement roomsMeasurement = new RoomsMeasurement();
        Rectangle bathroom = roomsMeasurement.getRoom();
        Rectangle kitchen = roomsMeasurement.getRoom();

        double totalArea = roomsMeasurement.calculateTotalArea(bathroom, kitchen);

        roomsMeasurement.scanner.close();

        System.out.println("The area of the kitchen and bathroom is: "+totalArea);

    }

    public Rectangle getRoom(){

        System.out.print("Supply room length: ");
        double length = scanner.nextDouble();

        System.out.print("Supply room width: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }


    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.area() + rectangle2.area();
    }

}
