import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        if(word.toLowerCase().startsWith("j")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //    print alphabetical characters
       /* char letter = 'A';
                while (letter <= 'Z') {
                    System.out.print(letter);
                    letter++;
        }*/
    }
}