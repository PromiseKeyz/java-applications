public class FaceBookGrowth{
	
	public static void main(String[] args){
		
		double presentUser = 1000000000;
		double growthRatePerMonth = 0.04;
		int target1 = 1500000000;
		int target2 = 2000000000;
		int month = 0;
		double newUser = 0;
		
		while(presentUser < target1){
			presentUser *= (1 + growthRatePerMonth); 
			month++;
		}
		
		System.out.println();
		System.out.println("For 1.5 billion users");
		System.out.println("------------------------------------------");
		
		System.out.printf("→ Facebook reached 1.5 billion users after %d months.%n", month);
		System.out.printf("→ Facebook reached %,.0f users after %d months.%n", presentUser, month);

		System.out.println();
		
		presentUser = 1000000000;
		month = 0;
		while(presentUser < target2){
			presentUser *= (1 + growthRatePerMonth); 
			month++;
		}
		
		System.out.println("For 2 billion users");
		System.out.println("------------------------------------------");
		System.out.printf("→ Facebook reached %,.0f users after %d months.%n", presentUser, month);
		System.out.printf("→ Facebook reached 2 billion users after %d months.%n", month);
		System.out.println();
	}
	
}