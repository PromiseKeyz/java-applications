import java.util.Scanner;

public class PositiveNegativeSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;
        int counter = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter -1 to terminate the loop");

        while (true) {
            System.out.print("Enter number: ");
            num = input.nextInt();

            // Sentinel value to stop the loop
            if (num == -1) {
                break;
            }

            // Add to total sum
            sum += num;
            counter++;

            // Check if number is positive or negative
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.printf("%nYou entered %d numbers.%n", counter);
        System.out.printf("Positive numbers: %d%n", positiveCount);
        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("The total sum is: %d%n", sum);
    }
}

		
		
		
		
		
		
// the sum of the total positive and negative are zeros 