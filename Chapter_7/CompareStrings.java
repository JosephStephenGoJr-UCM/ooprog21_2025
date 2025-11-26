import java.util.Scanner;

public class CompareStrings {
    
    public static void main (String [] a) {

        Scanner scanner = new Scanner (System.in);
        String name2 = "Carmen";

        System.out.print ("Enter your name > ");
        String name = scanner.nextLine();

        if (name.equals(name2)) {
            System.out.println (name2 + " equals " + name);
        } else {
            System.out.println (name2 + " does not equal " + name);
        }
    }
}
