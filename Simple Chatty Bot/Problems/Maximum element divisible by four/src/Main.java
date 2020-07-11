import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int max = 0;

        for(int i=1; i<=arraySize; i++){
            int currentInt = scanner.nextInt();

            max = currentInt % 4 == 0 && currentInt > max ? currentInt : max;
        }

        System.out.println(max);
    }
}