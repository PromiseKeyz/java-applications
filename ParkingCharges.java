/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three hours.
 The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
 The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time. 
 Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday.
 You should enter the hours parked for each customer. 
 The program should display the charge for the current customer and should calculate and display the 
 running total of yesterday’s receipts. 
It should use the method calculateCharges to determine the charge for each customer. */






import java.util.Scanner;

public class ParkingCharges {

    // Method to calculate parking charge
    public static double calculateCharges(double hours) {
        double charge = 2.00; // minimum charge

        if (hours > 3.0) {
            charge += 0.50 * (Math.ceil(hours) - 3.0); // round up to next hour
        }

        if (charge > 10.00) {
            charge = 10.00; // maximum charge
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0; // running total
        int customerCount;

        System.out.print("Enter number of customers: ");
        customerCount = input.nextInt();

        for (int i = 1; i <= customerCount; i++) {
            System.out.printf("%nEnter hours parked for customer %d: ", i);
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Customer %d charge: $%.2f%n", i, charge);
        }

        System.out.printf("%nTotal receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }
}
