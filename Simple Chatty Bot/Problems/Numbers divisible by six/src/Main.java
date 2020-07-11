import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();

        int sum = 0;
        for(int i=1; i<= numberOfElements; i++){
            int currentElement = scanner.nextInt();
            if(currentElement % 6 == 0){
                sum += currentElement;
            }
        }

        System.out.println(sum);

    }
}