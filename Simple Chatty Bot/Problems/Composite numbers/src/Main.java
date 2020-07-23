import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        long half = number / 2;

        int i=2;
        while (i <= half){
            if(number % i == 0){
                return true;
            }
            i++;
        }

        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}