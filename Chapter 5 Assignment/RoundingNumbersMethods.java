/*(Rounding Numbers) To round numbers to specific decimal places, use a statement like
 y = Math.floor(x * 10 + 0.5) / 10; 
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or 
y = Math.floor(x * 100 + 0.5) / 100; 
which rounds x to the hundredths position (i.e., the second position to the right of the decimal point).
 Write an application that defines four methods for rounding a number x in various ways: 
a) roundToInteger(number) 
b) roundToTenths(number)
c) roundToHundredths(number) 
d) roundToThousandths(number) 
For each value read, your program should display the original value, the number rounded
 to the nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest 
 hundredth and the number rounded to the nearest thousandth. */


import java.util.Scanner;

public class RoundingNumbersMethods {

    // a) Round to integer
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // b) Round to tenths
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // c) Round to hundredths
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // d) Round to thousandths
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;

        System.out.println("Enter a number (or -1 to quit): ");
        x = input.nextDouble();

        while (x != -1) {
            System.out.printf("%nOriginal number: %.6f%n", x);
            System.out.printf("Rounded to integer: %.0f%n", roundToInteger(x));
            System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(x));
            System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(x));
            System.out.printf("Rounded to thousandths: %.3f%n", roundToThousandths(x));

            System.out.println("\nEnter another number (-1 to quit): ");
            x = input.nextDouble();
        }

        System.out.println("\nProgram ended.");
        input.close();
    }
}
