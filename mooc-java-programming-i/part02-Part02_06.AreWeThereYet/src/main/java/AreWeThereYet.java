
import java.util.ArrayList;
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        int index = numbers.size() - 1;
        while (index >= 0) {
            int number = numbers.get(index);
            System.out.println(number);
            index = index - 1;
        }
    }
}
