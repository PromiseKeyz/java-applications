import java.util.Scanner;

public class UsingMathClassMax{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number of your choice: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter any number of your choice: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any number to find the square root: ");
		int squareRootNum = input.nextInt();
		
		int castedSquareRootNum = (int)Math.sqrt(squareRootNum);
		
		System.out.printf("The absolute value of the number is %d%n", Math.abs(num1),Math.abs(num2));
		System.out.printf("The Maximum number is %d%n", Math.max(num1,num2));
		System.out.printf("The Minimum number is %d%n", Math.min(num1,num2));
		System.out.printf("The square root is %d%n",castedSquareRootNum);
		System.out.printf("The answer is %f%n", Math.pow(num1,2)*Math.pow(num2,2));
		System.out.printf("The random number is %f%n",Math.random());
	
	
	}
}
/* storing a variable inside a stack.the stack and hip are containers for storing variables.
the STACK is a data structure that follow the rule "last in,first out(LIFO)