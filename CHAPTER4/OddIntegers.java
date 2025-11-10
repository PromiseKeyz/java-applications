public class OddIntegers{
	
	public static void main(String[] args){
		int addOddNum = 1;
		int count = 1;
		while(count <= 15){
				
			if(count % 2 != 0){
				addOddNum *= count;
			}
			
			count++;
			
		}
		
		System.out.printf("The total odd number is: %d",addOddNum);
	}
	
	
}