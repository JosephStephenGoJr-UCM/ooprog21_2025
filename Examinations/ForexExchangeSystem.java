import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};

        double[][] rates = new double[5][5];
        
        System.out.println("=== Enter Exchange Rates (PHP) for Each Currency ===\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Rate on Nov " + (j + 1) + ": ");
                rates[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        System.out.println("\n================ FOREX SUMMARY (Nov 1 - Nov 5) ================");
        System.out.printf("%-10s %-7s %-7s %-7s %-7s %-7s %-10s %-10s\n",
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {

            double peak = rates[i][0];
            double lowest = rates[i][0];

            for (int j = 1; j < 5; j++) {
                if (rates[i][j] > peak)
                    peak = rates[i][j];

                if (rates[i][j] < lowest)
                    lowest = rates[i][j];
            }

            System.out.printf("%-10s ", currencies[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-7.2f ", rates[i][j]);
            }
            System.out.printf("%-10.2f %-10.2f\n", peak, lowest);
        }

        System.out.println("\n=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("( + increase / - decrease / No Change )");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\nCurrency: " + currencies[i]);

            for (int j = 1; j < 5; j++) {
                System.out.print("Nov " + j + " -> Nov " + (j + 1) + ": ");

                if (rates[i][j] > rates[i][j - 1]) {
                    System.out.printf("+ %.2f\n", (rates[i][j] - rates[i][j - 1]));
                } 
                else if (rates[i][j] < rates[i][j - 1]) {
                    System.out.printf("- %.2f\n", (rates[i][j - 1] - rates[i][j]));
                } 
                else {
                    System.out.println("No Change");
                }
            }
        }

        input.close();
    }
}

