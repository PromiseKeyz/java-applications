import java.util.Scanner;
public class CompoundInterest{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Year \t \t");
		System.out.printf("Amount on Deposit%n");
		
		int principal = 1000;
		double interest = 10;
		int year = 10;
		double newAmount;
		byte count = 1;
		
		

		for(double i = 5; i <= 10; i++){
			System.out.printf("For %.2f percent%n",i);
			for(int j = 1; j <= year; j++){		
				newAmount = principal * Math.pow(1 + i/100, j);
				System.out.printf("%d \t \t",j);
				System.out.printf("%.2f %n",newAmount);
			}
			
			System.out.println();
		}
		
		
	}
	
}