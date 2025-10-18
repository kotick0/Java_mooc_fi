import java.util.ArrayList;

public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public boolean equals(Object compared) {
        Archive comparedItem = (Archive) compared;

        return this.id.equals(comparedItem.id);

    }
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
