import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final int NUM_EMPLOYEES = 3;
        final double OVERTIME_RATE = 1.5;

        // Loop for each employee
        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");

            // Input hours worked and hourly rate
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            // Calculate gross pay
            double grossPay;
            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                double overtimeHours = hours - 40;
                grossPay = (40 * rate) + (overtimeHours * rate * OVERTIME_RATE);
            }

            // Display gross pay
            System.out.printf("Employee %d gross pay: $%.2f%n", i, grossPay);
        }

        input.close();
    }
}
