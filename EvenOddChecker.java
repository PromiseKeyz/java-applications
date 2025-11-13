/*(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine whether an integer is even. 
The method should take an integer argument and return true if the integer is even and false otherwise.
Incorporate this method into an application that inputs a sequence of integers (one at a time)
and determines whether each is even or odd. */

import java.util.Scanner;

public class EvenOddChecker {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String choice;

        do {
            // Input an integer
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            // Check even or odd
            if (isEven(number)) {
                System.out.printf("%d is even.%n", number);
            } else {
                System.out.printf("%d is odd.%n", number);
            }

            // Ask if user wants to continue
            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nProgram ended.");
        input.close();
    }
}
