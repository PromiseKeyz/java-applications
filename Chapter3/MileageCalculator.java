import java.util.Scanner;

public class MileageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables to keep track of total miles and gallons
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        // Sentinel value: -1 indicates user is done entering trips
        System.out.println("Enter miles driven for a trip (-1 to quit):");
        miles = input.nextInt();

        while (miles != -1) {  // Loop continues until user enters -1
            System.out.println("Enter gallons used for this trip:");
            gallons = input.nextInt();

            // Calculate miles per gallon for this trip
            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate and display combined MPG so far
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", combinedMPG);

            // Ask for next trip
            System.out.println("Enter miles driven for the next trip (-1 to quit):");
            miles = input.nextInt();
        }

        System.out.println("Thank you for using the Mileage Calculator!");
        input.close();
    }
}
