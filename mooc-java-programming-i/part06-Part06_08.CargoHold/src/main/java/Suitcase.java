import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        int currentWeight = 0;
        for(Item entry : this.items) {
            currentWeight+= entry.getWeight();
        } currentWeight+= item.getWeight();

        if(currentWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }
    public void printItems() {
        for(Item entry : this.items) {
            System.out.println(entry.getName() + " (" + entry.getWeight() + " kg)");
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item entry : this.items) {
            totalWeight += entry.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem() {
        Item returnObject = this.items.get(0);
        for(Item entry : this.items) {
            if(returnObject.getWeight() < entry.getWeight()) {
                returnObject = entry;
            }
        } return returnObject;

    }
    public String toString() {
        int weightCounter = 0;
        int itemCounter = 0;
        for(Item item : this.items) {
            itemCounter++;
            weightCounter += item.getWeight();
    }
    if (itemCounter == 1) {
        return itemCounter + " item (" + weightCounter + "kg)";
    } else if(this.items.isEmpty()) {
        return "no items (" + weightCounter +" kg)";
    }
    return itemCounter + " items (" + weightCounter + "kg)";
    
}
}
