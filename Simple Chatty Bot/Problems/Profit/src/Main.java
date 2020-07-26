import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double annMoney = scanner.nextDouble();
        double percent = scanner.nextInt();
        double targetAmount = scanner.nextDouble();

        double compound = annMoney;
        int years = 0;

        while (compound < targetAmount){
           double percentageAmount = (percent / 100)*compound;
           compound = compound + percentageAmount;
           years++;
        }

        System.out.println(years);
    }
}