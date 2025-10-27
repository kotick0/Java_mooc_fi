
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public boolean equals(Object toCompare) {
        Item comparedItem  = (Item) toCompare;
        if(comparedItem.name.equals(this.name)) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = this.hashCode() * 125;
        return hash;
    }

}
