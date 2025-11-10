import java.util.Scanner;
public class FairTax{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fair tax calculator \n");
		
		System.out.print("Enter expenses on housing: ");
		double housing = input.nextDouble();
		
		System.out.print("Enter expenses on food: ");
		double food = input.nextDouble();
		
		System.out.print("Enter expenses on clothing: ");
		double clothing = input.nextDouble();
		
		System.out.print("Enter expenses on transportation: ");
		double transportation = input.nextDouble();
		
		System.out.print("Enter expenses on education: ");
		double education = input.nextDouble();
	
		System.out.print("Enter expenses on health care: ");
		double healthcare = input.nextDouble();
		
		System.out.print("Enter expenses on vacations: ");
		double vacations = input.nextDouble();
		
		char dollar = '$';
		
		double totalExpenses = housing + food + clothing + transportation + education + healthcare + vacations;
		double fairTax23 = totalExpenses * 0.23;
		double fairTax30 = totalExpenses * 0.30;
		
		
		System.out.printf("Your total annual expenses: %c%.2f%n",dollar,totalExpenses);
		System.out.printf("FairTax at 23%%: %c%.2f%n", dollar, fairTax23);
		System.out.printf("FairTax at 30%%: %c%.2f%n", dollar, fairTax30);

		
		input.close();
	}
}