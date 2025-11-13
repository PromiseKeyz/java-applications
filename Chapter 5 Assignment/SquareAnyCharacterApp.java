/*(Displaying a Square of Any Character) Modify the method created in Exercise 5.18 to receive a 
second parameter of type char called fillCharacter. Form the square using the char provided as an argument.
 Thus, if side is 5 and fillCharacter is #, the method should display 
##### 
##### 
##### 
##### 
##### 
Use the following statement (in which input is a Scanner object) to read a character from the user at the keyboard:
 char fill = input.next().charAt(0);*/
 
 import java.util.Scanner;

public class SquareAnyCharacterApp {

    // Method to display a square with a given character
    public static void squareOfCharacter(int side, char fillCharacter) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read side length
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        // Read the fill character
        System.out.print("Enter a character to fill the square: ");
        char fill = input.next().charAt(0);

        System.out.println("\nSquare:");
        squareOfCharacter(side, fill);

        input.close();
    }
}

