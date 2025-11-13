/*Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
 3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. 
 Incorporate the method into an application that reads
 a value from the user and displays the result. */

import java.util.Scanner;

public class QualityPointsApp {

    // Method to determine quality points based on average
    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) return 4;
        else if (average >= 80 && average <= 89) return 3;
        else if (average >= 70 && average <= 79) return 2;
        else if (average >= 60 && average <= 69) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read average from the user
        System.out.print("Enter the student's average (0-100): ");
        int average = input.nextInt();

        // Determine quality points
        int points = qualityPoints(average);

        // Display the result
        System.out.printf("A student with average %d receives %d quality points.%n", average, points);

        input.close();
    }
}
