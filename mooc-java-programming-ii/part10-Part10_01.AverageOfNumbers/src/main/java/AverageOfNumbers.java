import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        // Write your program here
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        Double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
