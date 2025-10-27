import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCarts;

    public ShoppingCart() {
        this.shoppingCarts = new HashMap<>();
    }

    public void add(String product, int price) {
        if (shoppingCarts.containsKey(product)) {
            this.shoppingCarts.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.shoppingCarts.put(product, item);
        }
    }

    public int price() {
        int priceTotal = 0;
        for (String key : shoppingCarts.keySet()) {
            priceTotal += shoppingCarts.get(key).price();
        }
        return priceTotal;
    }

    public void print() {
        for (String key : shoppingCarts.keySet()) {
            System.err.println(shoppingCarts.get(key).toString());
        }
    }
}
