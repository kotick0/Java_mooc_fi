import java.util.ArrayList;
public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
        this.capacity = 1;    
    }

    @Override
    public void add(Item item) {
        if(this.items.isEmpty()) {
            this.items.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item) {
        if(this.items.contains(item)) {
            return true;
        }
        return false;
    }
}
