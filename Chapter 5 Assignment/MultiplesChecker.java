/*(Multiples) Write a method isMultiple that determines, 
for a pair of integers, whether the second integer is a multiple of the first.
 The method should take two integer arguments and return true if the second is
 a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
 Incorporate this method into an application that inputs a series of pairs of integers
 (one pair at a time) and determines
 whether the second value in each pair is a multiple of the first. */
 
 import java.util.Scanner;

public class MultiplesChecker {

    // Method to check if b is a multiple of a
    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second;
        String choice;

        do {
            // Input a pair of integers
            System.out.print("Enter the first integer: ");
            first = input.nextInt();

            System.out.print("Enter the second integer: ");
            second = input.nextInt();

            // Check if second is a multiple of first
            if (isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d.%n", second, first);
            } else {
                System.out.printf("%d is NOT a multiple of %d.%n", second, first);
            }

            // Ask if user wants to continue
            System.out.print("Do you want to enter another pair? (yes/no): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nProgram ended.");
        input.close();
    }
}
