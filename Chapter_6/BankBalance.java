import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;
        int year = 1;
        double balance;

        
        do {
            System.out.print("Enter initial bank balance > ");
            balance = input.nextDouble();

            if (balance <= 0) {
                System.out.println("Balance must be greater than 0. Please try again.\n");
            }
        } while (balance <= 0);

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        int choice = input.nextInt();

        while (choice == 1) {
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", 
                              year, INTEREST_RATE, balance);

            year++;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no: ");
            choice = input.nextInt();
        }

        input.close();
    }
}
