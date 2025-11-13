import java.util.Scanner;

public class UsingMathClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any negative number: ");
		int num = input.nextInt();
		
		System.out.printf("The absolute value of the number is %d%n", Math.abs(num));
	
	}
}