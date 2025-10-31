import java.util.Scanner;

public class DecryptData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the encrypted four-digit integer: ");
        int number = input.nextInt();

        // Extract digits
        int d1 = (number / 1000) % 10;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Step 1: Swap back 1↔3 and 2↔4
        int temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Step 2: Reverse the (digit + 7) % 10
        d1 = (d1 + 10 - 7) % 10;
        d2 = (d2 + 10 - 7) % 10;
        d3 = (d3 + 10 - 7) % 10;
        d4 = (d4 + 10 - 7) % 10;

        // Step 3: Display decrypted number
        System.out.printf("Decrypted number: %d%d%d%d%n", d1, d2, d3, d4);

        input.close();
    }
}
