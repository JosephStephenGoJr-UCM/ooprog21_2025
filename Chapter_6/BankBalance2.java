import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;
				int year = 1;
        int choice;
			
        System.out.print("Enter initial bank balance: ");
        double balance = input.nextDouble();

        do {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no: ");
            choice = input.nextInt();

            if (choice == 1) {
                balance = balance + (balance * INTEREST_RATE);
                System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n\n", year, INTEREST_RATE, balance);
                year++;
            }

        } while (choice == 1);

        input.close();
    }
}
