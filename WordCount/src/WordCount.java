import java.io.File;
import java.util.Scanner;


public class WordCount {

    public static void main(String [] args) throws Exception
    {
        File file = new File("twotales.txt");
        Scanner scanner = new Scanner(file);


//        int totalWords = 0;
        while (scanner.hasNextLine()){
//            String line = scanner.nextLine();

                System.out.println("line counted");

//            System.out.println(line.split(" "));

        }

//        System.out.println("The total number of words in this book is: "+ totalWords);

    }
}
