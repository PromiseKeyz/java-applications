public class Factorial{
	
	public static void main(String[] args){
		long fact = 1;
		int count = 1; 
		
		System.out.print("Numbers(n) \t \t");
		System.out.printf("Factorial(n)%n");
		
		while(count <= 20){
			fact *= count;
			System.out.printf("%d \t \t \t",count);
			System.out.printf("%d",fact);
			System.out.println();
			count++;
		}
		
		/*
			⚠️ Why it won’t work for larger values like 100!

			
			As we discussed before:

			long can only hold values up to about 9,223,372,036,854,775,807.

			But 100! has 158 digits, way too large for any built-in numeric type.

			To calculate 100!, you’d need to use Java’s BigInteger class.
		*/
	}
	
}