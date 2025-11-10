import java.util.Scanner;

public class SmallestValue{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers will be entered: ");
		int count = input.nextInt();
		
		System.out.print("Enter a random number: ");
		int number = input.nextInt();
		
		int smallestNum = number;
		
		for(int i = 0; i < count - 1; i++){
			System.out.print("Enter a random number: ");
			number = input.nextInt();
			
			if(number < smallestNum){
				smallestNum = number;
			}
		}
		
		System.out.printf("The smallest number is: %d%n",smallestNum);
		input.close();
	}
}