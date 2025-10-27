import java.util.ArrayList;

public class Recipes {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingrediants;

    public Recipes(String name, int time, ArrayList<String> ingrediants) {
        this.name = name;
        this.cookingTime = time;
        this.ingrediants = ingrediants;
    }
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.cookingTime;
    }
    public ArrayList<String> getIngredients() {
        return this.ingrediants;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
