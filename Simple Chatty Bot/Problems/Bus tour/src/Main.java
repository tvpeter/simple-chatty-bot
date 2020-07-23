import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int noBridges = scanner.nextInt();
        int counter = 1;
        String result = checkCrash(scanner, busHeight, noBridges, counter);
        System.out.println(result);
    }

    private static String checkCrash(Scanner scanner, int busHeight, int noBridges, int counter) {
        while (counter <= noBridges){
            int input = scanner.nextInt();

            if(busHeight >= input){
                return "Will crash on bridge " + counter;
            }
            counter++;
        }
        return  "Will not crash";
    }
}