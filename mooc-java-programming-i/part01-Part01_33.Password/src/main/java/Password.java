
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String input = String.valueOf(scan.nextLine());
        String password = "Caput Draconis";
        if (password.equals(input)) {
            System.err.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        // Write your program here
    }
}
