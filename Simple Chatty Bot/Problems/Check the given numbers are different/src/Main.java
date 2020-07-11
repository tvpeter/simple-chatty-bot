import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        boolean result;
         if((value1 != value2) && (value1 != value3) && (value2 != value3 )){
             result = true;
         }else {
             result = false;
         }
        System.out.println(result);
    }
}