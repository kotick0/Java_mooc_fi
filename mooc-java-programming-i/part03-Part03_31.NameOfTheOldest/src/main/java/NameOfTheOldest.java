
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String nameOfOldest = "";
        while (true) {
             String input = scanner.nextLine();
             if (input.equals("")) {
                break;
             }
             String[] parts = input.split(",");
             for(int i = 1; i < parts.length; i += 2) {
                if (oldest < Integer.valueOf(parts[i])) {
                    oldest = Integer.valueOf(parts[i]);
                    nameOfOldest = parts[i-1];
                }
             }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
