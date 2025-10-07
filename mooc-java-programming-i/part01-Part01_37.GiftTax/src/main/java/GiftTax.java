
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0;
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value >= 1_000_000) {
            tax = 142_100 + (value - 1_000_000) * 0.17;
            System.out.println("Tax: " + tax);
        } else if (value >= 200000 && value < 1_000_000) {
            tax = 22100 + (value - 200_000) * 0.15;
            System.err.println("Tax: " + tax);
        } else if (value >= 55000 && value < 200_000) {
            tax = 4700 + (value - 55000) * 0.12;
            System.err.println("Tax: " + tax);
        } else if (value >= 25000 && value < 55000) {
            tax = 1700 + (value - 25000) * 0.10;
            System.err.println("Tax: " + tax);
        } else if (value >= 5000 && value < 25000) {
            tax = 100 + (value - 5000) * 0.08;
            System.err.println("Tax: " + tax);
        } else {
            System.err.println("No tax!");
        }
    }
}
