
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num_inputted = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            num_inputted = num_inputted + 1;
            sum = sum + number;
        }
    System.out.println("Number of numbers: " + num_inputted);
    System.out.println("Sum of the numbers: " + sum);
    }
}
