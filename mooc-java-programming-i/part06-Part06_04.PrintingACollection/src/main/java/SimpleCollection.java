
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String collection = "";
        // for(String element : this.elements) {
        //     collection = collection + element + "\n";
        // }

        for(String element : this.elements) {
            collection = collection + element + "\n";
        }
        if(this.elements.size() == 1) {
                return "The collection "+ this.name +" has " + elements.size() + " element:\n" + collection;
            }
            return "The collection "+ this.name +" has " + elements.size() + " elements:\n" + collection;
        
    }

}
