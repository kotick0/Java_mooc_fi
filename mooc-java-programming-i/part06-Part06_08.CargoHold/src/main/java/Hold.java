import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase (Suitcase suitcase) {
        if(suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
        
    }
    public String toString() {
        int totalSuitcases = 0;
        int totalWeight = 0;
        for(Suitcase entry : this.suitcases) {
            ++totalSuitcases;
            totalWeight += entry.totalWeight();
        } return totalSuitcases + " suitcases (" + totalWeight + " kg)"; 
    }
    public void printItems() {
        for(Suitcase entry : this.suitcases) {
            entry.printItems();
        }
    }
}
