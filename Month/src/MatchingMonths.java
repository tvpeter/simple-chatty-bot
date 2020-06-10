import java.util.Scanner;

public class MatchingMonths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

         int selectedDay;

         do {
             System.out.print("Supply the day of the week number counting from monday: ");
             selectedDay = scanner.nextInt();
         }while (isInvalid(selectedDay));

        String day = weekDays[selectedDay-1];

        System.out.println("The selected weekday for "+ selectedDay + " is "+ day);

    }
    public static boolean isInvalid(int day){
        if(day < 1 || day > 7)
            return true;
        return false;
    }


}
