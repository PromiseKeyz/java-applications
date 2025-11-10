public class OperatorsPart2{
	public static void main(String[] args){
		int num1 = 30;
		int num2 = 35;
		int num3 = 17;
		
		// Logical Operators  for (&&) "AND". 
		// both conditions must be true for it to return true
		boolean result = (num1 > num2) && (num1 > num3);
		
		System.out.printf("The result is %b%n",result);
		
		// OR returns true if one of the conditions is true
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n",result2);
		
		// Not logical operator, it reverses the result of the condition.
		boolean result3 = !(num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result3);
		
		//pre- increment unary operator
		
		int num4 = 10;
		System.out.printf("%d%n", num4);
		System.out.printf("%d%n", ++num4);
		
		//post -increment unary operator
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5++);
		
		//for decrement ,do same
		// ++num means you add 1 to the variable
		// num++ means you add 1 after printing
		
		
		
		
	}
}