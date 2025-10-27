
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            
            if(command.equals("add") && first + value <= 100 && value >= 0) {
                first += value;
            } else if(command.equals("add") && first + value > 100) {
                first = 100;
            }

            if(command.equals("move") && first - value >= 0 && value >= 0 && value <= 100) {
                second += value;
                first -= value;
            } else if(command.equals("move") && value > 100) {
                second = 100;
                first = 0;
            }
            if(command.equals("remove") && value <= second) {
                second -= value;
            }
        }
    }

}
