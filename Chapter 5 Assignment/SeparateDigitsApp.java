/*(Separating Digits) Write methods that accomplish each of the following tasks: 
a) Calculate the integer part of the quotient when integer a is divided by integer b. 
b) Calculate the integer remainder when integer a is divided by integer b. 
c) Use the methods developed in parts (a) and (b) to write a method displayDigits 
that receives an integer between 1 and 99999 and displays it as a sequence of digits, 
separating each pair of digits by two spaces. For example, the integer 4562 should appear as
 4	 5	 6 	2 
Incorporate the methods into an application that inputs an integer and calls displayDigits
 by passing the method the integer entered. Display the results. */
 
 import java.util.Scanner;

public class SeparateDigitsApp {

    // Method to calculate integer quotient
    public static int integerQuotient(int a, int b) {
        return a / b;
    }

    // Method to calculate integer remainder
    public static int integerRemainder(int a, int b) {
        return a % b;
    }

    // Method to display digits separated by 2 spaces
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999.");
            return;
        }

        int divisor = 10000;
        boolean started = false;

        while (divisor >= 1) {
            int digit = integerQuotient(number, divisor);
            if (digit != 0 || started) {
                System.out.print(digit + "  ");
                started = true;
            }
            number = integerRemainder(number, divisor);
            divisor /= 10;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        System.out.println("Digits of the number:");
        displayDigits(number);

        input.close();
    }
}

 
