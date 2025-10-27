
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public int getCurrentWeight() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() + this.getCurrentWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
