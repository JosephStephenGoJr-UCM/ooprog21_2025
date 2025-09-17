import java.util.Scanner;

    class DemoGrossPay {
        public static void main (String [] args) {
            Scanner input = new Scanner (System.in);

            System.out.print ("Input the number of hours worked: ");
            double hoursWorked = input.nextDouble();

            calculateGross(hoursWorked);
        }

        public static void calculateGross (double hours) {
            final double HOURLY_RATE = 22.75;
            double grossPay = hours * HOURLY_RATE;

            System.out.print (hours + " hours at " + "$" + HOURLY_RATE + " per hour is " + "$" + grossPay);
        }
    }
