import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> debtHashMap;
    
    public IOU() {
        this.debtHashMap = new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        this.debtHashMap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        return this.debtHashMap.getOrDefault(toWhom, 0.0);
    }
}
