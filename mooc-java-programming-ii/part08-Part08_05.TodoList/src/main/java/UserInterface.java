import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            if(input.equals("stop")) {
                break;
            }
            if(input.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            }
            if(input.equals("list")) {
                this.list.print();
            }
            if(input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskToRemove = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(taskToRemove);
            }
        }
        
    }
}
