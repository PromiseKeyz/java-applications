import java.util.Scanner;
import java.util.Scanner;

public class CreditLimitChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables for customer data
        int accountNumber;
        double beginningBalance;
        double totalCharges;
        double totalCredits;
        double creditLimit;

        // Sentinel-controlled loop: enter account number -1 to quit
        System.out.println("Enter customer account number (-1 to quit):");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            // Input other customer details
            System.out.println("Enter beginning balance:");
            beginningBalance = input.nextDouble();

            System.out.println("Enter total charges for this month:");
            totalCharges = input.nextDouble();

            System.out.println("Enter total credits applied this month:");
            totalCredits = input.nextDouble();

            System.out.println("Enter allowed credit limit:");
            creditLimit = input.nextDouble();

            // Calculate new balance
            double newBalance = beginningBalance + totalCharges - totalCredits;

            // Display results
            System.out.println("\nAccount Number: " + accountNumber);
            System.out.printf("New Balance: %.2f%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!");
            } else {
                System.out.println("Within credit limit.");
            }

            System.out.println("\n-----------------------------\n");

            // Ask for next customer
            System.out.println("Enter customer account number (-1 to quit):");
            accountNumber = input.nextInt();
        }

        System.out.println("Thank you for using the Credit Limit Checker!");
        input.close();
    }
}