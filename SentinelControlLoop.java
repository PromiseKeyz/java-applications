import java.util.Scanner;

public class SentinelControlLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        int counter = 0;  // ✅ Initialize counter before using it

        System.out.println("Enter -1 to terminate the loop");

        while (true) {
            System.out.print("Enter number: ");
            num = input.nextInt();

            if (num == -1) {  // Sentinel value check
                break;
            }

            sum += num;
            counter++;
        }

        System.out.printf("The total of the %d number(s) is %d%n", counter, sum);
    }
}
