/*(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of a right triangle 
when the lengths of the other two sides are given. The method should take two arguments of type double 
and return the hypotenuse as a double. Incorporate this method into an application that reads values 
for side1 and side2 and performs the calculation with the hypotenuse method. Use Math methods pow and 
sqrt to determine the length of the hypotenuse for each of the triangles in Fig. 5.14. 
[Note: Class Math also provides method hypot to perform this calculation.] */

import java.util.Scanner;

public class HypotenuseCalculator {

    // Method to calculate hypotenuse
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read side1 and side2 from user
        System.out.print("Enter the length of side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = input.nextDouble();

        // Calculate hypotenuse
        double hypotenuseLength = hypotenuse(side1, side2);

        // Display result
        System.out.printf("For sides %.2f and %.2f, the hypotenuse is %.2f%n", 
                          side1, side2, hypotenuseLength);

        input.close();
    }
}

 

