/*(Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint numbers.
 Use the Math.min method to implement minimum3. Incorporate the method into an application that reads 
 three values from the user, determines the smallest value and displays the result. 
 */
 
 import java.util.Scanner;

public class Minimum3App {

    // Method to find the minimum of three numbers
    public static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three floating-point numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Determine the smallest number
        double min = minimum3(num1, num2, num3);

        // Display the result
        System.out.printf("The smallest of %.2f, %.2f, and %.2f is %.2f%n", num1, num2, num3, min);

        input.close();
    }
}



