/*(Temperature Conversions) Implement the following integer methods:
 a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation 
celsius = 5.0 / 9.0 * (fahrenheit - 32); 
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, 
using the calculation fahrenheit = 9.0 / 5.0 * celsius + 32; 
c) Use the methods from parts (a) and (b) to write an application that enables 
the user either to enter a Fahrenheit temperature and display the Celsius equivalent 
or to enter a Celsius temperature and display the Fahrenheit equivalent. */

import java.util.Scanner;

public class TemperatureConverterApp {

    // Convert Fahrenheit to Celsius
    public static int celsius(int fahrenheit) {
        return (int)(5.0 / 9.0 * (fahrenheit - 32));
    }

    // Convert Celsius to Fahrenheit
    public static int fahrenheit(int celsius) {
        return (int)(9.0 / 5.0 * celsius + 32);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Conversion");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            int f = input.nextInt();
            int c = celsius(f);
            System.out.printf("%d°F is approximately %d°C%n", f, c);
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            int c = input.nextInt();
            int f = fahrenheit(c);
            System.out.printf("%d°C is approximately %d°F%n", c, f);
        } 
        else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }

        input.close();
    }
}

