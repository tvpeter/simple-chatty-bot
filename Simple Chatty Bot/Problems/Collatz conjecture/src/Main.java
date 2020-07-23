import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();
        System.out.print(naturalNumber + " ");
        int nextNumber = naturalNumber;
        while (nextNumber > 1){
            nextNumber = (nextNumber % 2 == 0) ?  nextNumber / 2 : (nextNumber * 3) + 1;
            System.out.print(nextNumber + " ");
        }
    }

}