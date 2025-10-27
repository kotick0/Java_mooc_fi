
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersAdded = 0;
        int count = 0;
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                numbersAdded += input;
                count++;
            }
        }
        if(numbersAdded != 0) {
            double result = 1.0 * (numbersAdded / count);
            System.out.println(result);
        } else {
        System.out.println("Cannot calculate the average");
        }
    }
}
