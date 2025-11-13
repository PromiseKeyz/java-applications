import java.util.Scanner;
public class MethodOverloading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char choice;
		do{
		
			System.out.println("=======================");
		System.out.println("Calculating Perimeter of different shapes");
		System.out.println("=======================");
		
		System.out.println("Enter 1: For Square");
		System.out.println("Enter 2: For Rectangle");
		System.out.println("Enter 3: For Triangle");
		System.out.println("Enter 4: To exit");
		
		System.out.print("Enter your option: ");
		int option = input.nextInt();
		
		switch(option){
			case 1:
					System.out.print("Enter the lenth of the square: ");
					int squarelenght = input.nextInt();
					
					perimeter(squarelenght);
			break;
			case 2:
					System.out.print("Enter the lenth of the rectangle: ");
					int lenght = input.nextInt();
					
					System.out.print("Enter the height of the rectangle: ");
					int height = input.nextInt();
					
					perimeter(lenght,height);
			break;
			
			case 3:
					System.out.print("Enter the lenth1 of the triangle: ");
					int lenght1 = input.nextInt();
					
					System.out.print("Enter the lenth2 of the triangle: ");
					int lenght2 = input.nextInt();
					
					System.out.print("Enter the base of the triangle: ");
					int base = input.nextInt();
					
					perimeter(lenght1,lenght2,base);
			break;
			
			case 4:
					System.out.println("Exiting program, Goodbye ....: ");
					return;
			
			
			default:
			System.out.println("Invalid input");
			
		}	
		System.out.println();
		System.out.print("Do you want to run the program again?(Y/N) ");
			choice = input.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');
	}
	public  static void perimeter(int a){
		int per = 4 * a;
		System.out.println("");
		System.out.println("==========================");
		System.out.printf("The perimeter of the square is %d%n",per);
	}
	public static void perimeter(int a,int b){
		int per = 2 * (a + b);
		System.out.printf("The perimeter of the rectangle is %d%n",per);
		
	}
	public static void perimeter(int a, int b, int c){
		int per = a+ b + c;
		System.out.printf("The perimeter of the triangle is %d%n",per);
	}
}
