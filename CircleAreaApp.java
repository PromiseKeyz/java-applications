/*(Circle Area) Write an application that prompts the user for the radius of a 
circle and uses a method called circleArea to calculate the area of the circle. */

import java.util.Scanner;

public class CircleAreaApp {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area
        double area = circleArea(radius);

        // Display result
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        input.close();
    }
}
