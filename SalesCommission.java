import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseSalary = 200.00;
        double commissionRate = 0.09;
        double totalSales = 0.0;
        String choice;

        System.out.println("=== Sales Commission Calculator ===");
        System.out.println("Enter the value of each item sold last week.");
        System.out.println("Type 'done' when finished.\n");

        while (true) {
            System.out.print("Enter item value (or 'done' to finish): ");
            choice = input.next();

            // Check if the user is done
            if (choice.equalsIgnoreCase("done")) {
                break;
            }

            // Convert input to number and add to total
            try {
                double itemValue = Double.parseDouble(choice);
                if (itemValue < 0) {
                    System.out.println("Value cannot be negative. Try again.");
                } else {
                    totalSales += itemValue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or 'done'.");
            }
        }

        // Calculate commission and total pay
        double commission = commissionRate * totalSales;
        double totalEarnings = baseSalary + commission;

        // Display the result
        System.out.println("\n===== Weekly Earnings Report =====");
        System.out.printf("Total Sales: $%.2f%n", totalSales);
        System.out.printf("Commission (9%%): $%.2f%n", commission);
        System.out.printf("Base Salary: $%.2f%n", baseSalary);
        System.out.printf("Total Earnings: $%.2f%n", totalEarnings);

        input.close();
    }
}
