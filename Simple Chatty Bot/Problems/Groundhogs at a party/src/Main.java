import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int peanuts = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if((peanuts >= 10 && peanuts <= 20 && !isWeekend) ||
        (peanuts >= 15 && peanuts<=25 && isWeekend)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}