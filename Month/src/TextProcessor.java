import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your sentence here: ");
        String words =scanner.nextLine();
        scanner.close();

        String wordsArray[] = words.trim().split(" ");

        String word = wordsArray[0];

        count(words);

        reverseWord(word);

        addSpaces("TheWorldWillOvercomeCovid-19");
        reverseString(word);

    }

    /**
     * count and split given text
     * @param text
     */
    public static void count(String text){

        var textArray = text.split(" ");

        for(String word:textArray){
            System.out.println(word);
        }

        System.out.println("Length of given sentence is " + textArray.length);
    }

    /**
     * reverses given string
     * @param word String to be reversed
     * @return String - the reversed string
     */
    public static void reverseString(String word){

        System.out.print("First word reversed: ");
            for(int i=word.length()-1; i>=0; i--){
                System.out.print(word.charAt(i));
            }

    }

    /**
     * reverse given string
     * @param word String to reverse
     */
    public static void reverseWord(String word){
        var modifiedText = new StringBuilder(word);

        modifiedText = modifiedText.reverse();

        System.out.println(modifiedText);

    }

    /**
     * add spaces to jumbled words at every uppercase
     * @param joinedWords String to insert spaces
     */
    public static void addSpaces(String joinedWords){
        var modifiedText = new StringBuilder(joinedWords);

        for(int i=0; i<modifiedText.length()-1; i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
