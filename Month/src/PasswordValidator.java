import java.util.Scanner;

public class PasswordValidator {

    private static final int PASSWORD_LENGTH = 8;
    private static String username;
    private static String oldPassword;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your username: ");
        username = scanner.nextLine().trim();

        System.out.println("Supply your old password");
        oldPassword = scanner.nextLine().trim();

        String newPassword;
        do {
            System.out.println("Supply a valid new password");
            newPassword = scanner.nextLine().trim();
        }while (validatePassword(newPassword));

        scanner.close();

    }

    /**
     * check that given string meets the following criteria
     * - atleast 8 characters long
     * - contains an uppercase char
     * - contains a special char
     * - do not contain given username
     * - do not equal old password
     * @param password
     * @return
     */

    public static boolean validatePassword(String password){
         if(password.length() < PASSWORD_LENGTH || checkUpperCase(password)
                 || checkSpecialChar(password) || password.contains(username)
                 || password.equals(oldPassword) ) {
             return true;
         }

        return false;
    }

    /**
     * check given string contains special characters
     * @param password string to check
     * @return true if it doesn't otherwise false
     */
    private static boolean checkSpecialChar(String password) {
        boolean result = true;
        for(int i=0; i<password.length()-1; i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                result = false;
            }
        }
        return result;
    }

    /**
     * check if given string contains uppercase
     * @param password string to check for uppercase char
     * @return true if none otherwise false
     */
    private static boolean checkUpperCase(String password) {
        boolean result = true;
        for(int i=0; i<password.length()-1; i++){
            if(Character.isUpperCase(password.charAt(i))){
                result = false;
            }
        }
        return result;
    }
}
