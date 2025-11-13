/*(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid square 
(the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
 For example, if side is 4, the method should display
 ****
 ****
 ****
 ****
 Incorporate this method into an application that reads an integer value for side
 from the user and outputs the asterisks with the squareOfAsterisks method.*/ 
import java.util.Scanner;

public class SquareAsterisksApp {

    // Method to display a square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the side length from the user
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        System.out.println("\nSquare of asterisks:");
        squareOfAsterisks(side);

        input.close();
    }
}
