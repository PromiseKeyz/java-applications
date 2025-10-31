/*Set counter = 1
Set largest = 0

While counter <= 10
    Prompt user to enter number
    Input number

    If number > largest
        largest = number
    End If

    Increment counter by 1
End While

Display "The largest number is: " + largest*/

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;      // counts from 1 to 10
        int number;           // current number entered
        int largest = Integer.MIN_VALUE; // smallest possible integer as initial value

        // Input 10 numbers
        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            // Check if this number is larger than the current largest
            if (number > largest) {
                largest = number;
            }

            counter++; // move to next
        }

        // Display the result
        System.out.println("\nThe largest number entered is: " + largest);

        input.close();
    }
}
