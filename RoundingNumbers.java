/*9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
 y = Math.floor(x + 0.5); 
will round the number x to the nearest integer and assign the result to y.
 Write an application that reads double values and uses the preceding statement to round
 each of the numbers to the nearest integer. For each number processed, display both the
 original number and the rounded number.*/
 
 
import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;  // original number
        double y;  // rounded number

        System.out.println("Enter a number to round (or -1 to quit): ");
        x = input.nextDouble();

        while (x != -1) {
            y = Math.floor(x + 0.5);  // rounding formula

            System.out.printf("Original number: %.2f  ->  Rounded number: %.0f%n", x, y);

            System.out.println("\nEnter another number (-1 to quit): ");
            x = input.nextDouble();
        }

        System.out.println("\nProgram ended.");
        input.close();
    }
}
