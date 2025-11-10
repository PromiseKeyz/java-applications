import java.util.Scanner;

public class GlobalWarming{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("What is the main cause of recent global warming according to most climate scientists? \n 1️⃣ Natural changes in the Earth’s orbit \n 2️⃣ Solar radiation variations \n 3️⃣ Human activities that release greenhouse gases \n 4️⃣ Volcanic eruptions ");
		System.out.print("Enter the answer (1-4): ");
		int answer1 = input.nextInt();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Which greenhouse gas is most responsible for trapping heat in Earth’s atmosphere? \n 1️⃣ Oxygen (O₂) \n 2️⃣ Carbon dioxide (CO₂) \n 3️⃣ Nitrogen (N₂) \n 4️⃣ Hydrogen (H₂) ");
		System.out.print("Enter the answer (1-4): ");
		int answer2 = input.nextInt();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("What do global warming skeptics often argue? \n 1️⃣ Climate change is entirely caused by human activity \n 2️⃣ Climate models are too uncertain to be trusted \n 3️⃣ The Earth is cooling, not warming \n 4️⃣ Greenhouse gases have no effect on temperature");
		System.out.print("Enter the answer (1-4): ");
		int answer3 = input.nextInt();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Which of the following is a likely effect of global warming? \n 1️⃣ Decrease in sea levels \n 2️⃣ More frequent extreme weather events \n 3️⃣ Shorter growing seasons for crops \n 4️⃣ Less melting of polar ice");
		System.out.print("Enter the answer (1-4): ");
		int answer4 = input.nextInt();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("What is one reason scientists use computer models to study climate change? \n 1️⃣ To eliminate human influence on results \n 2️⃣ To predict future climate patterns \n 3️⃣ To ignore natural climate variability \n 4️⃣ To replace real-world data");
		System.out.print("Enter the answer (1-4): ");
		int answer5 = input.nextInt();
		
		String grade;
		
		int score = 0;
		
		if(answer1 == 3){
			score++;
		}
		
		if(answer2 == 2){
			score++;
		}
		
		if(answer3 == 2){
			score++;
		}
		
		if(answer4 == 2){
			score++;
		}
		
		if(answer5 == 2){
			score++;
		}
		
		System.out.println();
		System.out.printf("You answered %d out of 5 questions correctly.%n",score);
		if(score == 5){
			System.out.println("Excellent");
		}else if(score == 4){
			System.out.println("Very good");
		}else if(score <= 3){
			System.out.println();
			System.out.println("Time to brush up on your knowledge of global warming");
			System.out.println();
			System.out.println("Here are some sources to learn more: ");
			System.out.println("- https://www.ipcc.ch");
			System.out.println("- https://climate.nasa.gov");
			System.out.println("- https://www.nationalgeographic.com/environment/");
			System.out.println("- https://www.climate.gov");
		}
		
		
		
	}
	
}