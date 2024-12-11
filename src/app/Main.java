package app;

import java.util.Scanner;

public class Main {
    static double tax;
    static double salary;
    static double salaryAfterTax;
    public static final String CURRENCY = "USD";
    static double taxPercent;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter only numbers!!!! \nEnter salary, USD: ");
        salary = scanner.nextDouble();

        if (salary > 0 && salary <= 10000) {
            taxPercent = 2.5;
        } else if (salary > 10000 && salary <= 25000) {
            taxPercent = 4.3;
        } else {
            taxPercent = 6.7;
        }
        if (salary > 0 && salary <= 10000) {
            tax = (salary * taxPercent) / 100;
            salaryAfterTax = salary - tax;
            System.out.printf("You enter salary: %.2f %s \n This month you paid %.2f %s into the country's treasury," +
                    "%n that's good!! " +
                    "\nYour income was %.2f %s", salary, CURRENCY, tax, CURRENCY, salaryAfterTax, CURRENCY);
        } else if (salary > 10000 && salary <= 25000) {
            tax = (salary * taxPercent) / 100;
            salaryAfterTax = salary - tax;
            System.out.printf("You enter salary: %.2f %s \n This month you paid %.2f %s into the country's treasury," +
                    "%n that's very good!! " +
                    "\nYour income was %.2f %s", salary, CURRENCY, tax, CURRENCY, salaryAfterTax, CURRENCY);
        } else if (salary > 25000) {
            tax = (salary * taxPercent) / 100;
            salaryAfterTax = salary - tax;
            System.out.printf("You enter salary: %.2f %s\n This month you paid %.2f %s into the country's treasury," +
                    "%n that's excellent!! " +
                    "\nYour income was %.2f %s", salary, CURRENCY, tax, CURRENCY, salaryAfterTax, CURRENCY);
        } else {
            System.out.println("Oh, it is very bad, you did not paid your tax this month. \n You must find a work!!!");
        }
    }
}
