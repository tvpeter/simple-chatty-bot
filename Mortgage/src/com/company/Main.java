package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float interest = 0;

        while (principal < 100000 || principal > 1000000) {
            System.out.print("Supply the principal :");
            principal = scanner.nextInt();
            if(principal < 100000 || principal > 1000000)
                System.out.println("Enter principal between 100,000 and 1,000,000");
        }

        while(interest < 1 || interest > 30) {
            System.out.print("Annual Interest Rate: ");
             interest = scanner.nextFloat();
             if (interest < 1 || interest > 30)
                 System.out.println("Enter interest between 1 and 30");
        }

        interest = interest / PERCENT / MONTHS_IN_YEAR;

        int years = 0;
        while(years < 1 || years > 30) {
            System.out.print("Period: ");
             years = scanner.nextByte();
             if(years < 1 || years > 30)
                 System.out.println("Enter years between 1 and 30");
        }

        years = years * MONTHS_IN_YEAR;

        String mortgage = numberFormat.format(getMortgage(principal, interest, years));

        System.out.println("Mortgage: " + mortgage);
    }


    private static double getMortgage(int principal, float interest, int years) {
        double num = Math.pow((1 +interest), years);

        double upper = num * interest;

        double down = num - 1;

        double result = upper/down;

        return principal * result;
    }
}
