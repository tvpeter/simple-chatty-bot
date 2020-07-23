import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static long factorial(long n) {
        // write your code here
        if(n == 0) return 1;

        long product = 1;
        while(n > 0){
            product *= n;
            n--;
        }

        return  product;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));

        int result = gcd(1,1);
        System.out.println(result);
    }
}