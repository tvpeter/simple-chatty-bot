import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();

        int max = 0;
        int i =1;

        while (i <= iterations){
            int currentInt = scanner.nextInt();
            max = currentInt % 4 == 0 && currentInt > max ? currentInt : max;
            i++;
        }
        System.out.println(max);
    }
}