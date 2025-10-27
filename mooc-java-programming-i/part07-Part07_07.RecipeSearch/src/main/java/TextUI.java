import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private ArrayList<Recipes> recipeList;

    public TextUI(Scanner scanner) {
        this.scanner = scanner;
        this.recipeList = new ArrayList<>();
    }

    public void start() {
        // CLI
        System.out.print("File to read: ");
        String filePath = this.scanner.nextLine();
        fileRead(filePath);

        System.out.println(
                "Commands: \nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time"
                        + //
                        "\n" + //
                        "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipes recipe : recipeList) {
                    System.err.println(recipe.toString());
                }
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedName = this.scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipes recipe : this.recipeList) { 
                    if (String.valueOf(recipe).contains(searchedName)) {
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println();
            }
            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(this.scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipes recipe : this.recipeList) {
                    if(maxTime >= recipe.getTime()) {    
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println();
            }
            if(command.equals("find ingredient")) {
                System.out.print("Ingrediant: ");
                String searchedIngrediant = this.scanner.nextLine();
                System.out.println("\nRecipes:");
                for(Recipes recipe : this.recipeList) {
                    String recipeIngrediantString = String.valueOf(recipe.getIngredients()).replace("[", "").replace("]", "");
                    String[] recipeIngrediantParts = recipeIngrediantString.split(", ");
                    for (String part : recipeIngrediantParts) {
                        if(part.equals(searchedIngrediant)) {
                            System.out.println(recipe.toString());
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    public void fileRead(String filePath) {
        try (Scanner fileReader = new Scanner(Paths.get(filePath))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.equals("")) {
                    continue;
                }
                String name = line;
                int time = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ingrediants = new ArrayList<>();

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingrediants.add(ingredient);
                }
                recipeList.add(new Recipes(name, time, ingrediants));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
