import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input;

       while ((input = scanner.nextInt()) != 0){
           System.out.println(input % 2 == 0 ? "even" : "odd");
       }
    }
}