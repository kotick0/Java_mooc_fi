import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productsStock.containsKey(product)) {
            return this.productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.productsStock.containsKey(product) && this.productsStock.get(product) -1 >= 0) {
            int newValue = this.productsStock.get(product);
            newValue -= 1;
            this.productsStock.replace(product, newValue);
            if (newValue > 0) {
                return true;
            }
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> productNames = new HashSet<>();
        for(String key: this.products.keySet()) {
            productNames.add(key);
        }
        return productNames;
    }
}
