
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int oldest = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            for (int i = 1; i < parts.length; i += 2) {
                if (oldest < Integer.valueOf(parts[i])) {
                    oldest = Integer.valueOf(parts[i]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
