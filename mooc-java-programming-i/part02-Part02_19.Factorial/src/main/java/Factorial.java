
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int result = 1;
        for (int i = number; i>=1; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}
