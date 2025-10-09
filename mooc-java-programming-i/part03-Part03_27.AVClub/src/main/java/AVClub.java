
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (input.equals("")) {
            break;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("av")) {
                System.out.println(words[i]);
            }
        }
    }
    }
}
