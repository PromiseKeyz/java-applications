public class WorldPopulationGrowth {
    public static void main(String[] args) {
        // Initial assumptions
        double initialPopulation = 8.231613070;     // in billions
        double growthRate = 0.0085;                // 0.85% per year

        double currentPopulation = initialPopulation;

        System.out.printf("%-5s %-20s %-20s%n", "Year", "Population (billions)", "Increase (billions)");
        System.out.println("---------------------------------------------------------------------");

        int doublingYear = -1;

        for (int year = 1; year <= 75; year++) {
            double increase = currentPopulation * growthRate;
            double newPopulation = currentPopulation + increase;

            System.out.printf("%-5d %-20.6f %-20.6f%n", year, newPopulation, increase);

            // Check for doubling
            if (doublingYear == -1 && newPopulation >= 2 * initialPopulation) {
                doublingYear = year;
            }

            currentPopulation = newPopulation;
        }

        if (doublingYear != -1) {
            System.out.println("\nAt this constant growth rate, the world population would double in about year: " + doublingYear);
        } else {
            System.out.println("\nAt this constant growth rate, the world population does **not** double within 75 years.");
        }
    }
}
