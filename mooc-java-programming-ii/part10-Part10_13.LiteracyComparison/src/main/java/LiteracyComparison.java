
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Country> literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .map(parts -> new Country(parts[3], Integer.valueOf(parts[4]), parts[2].replace(" (%)", ""), Double.valueOf(parts[5])))
                .forEach(country -> literacyList.add(country));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        literacyList.stream()
            .sorted((country1, country2) -> {
                double result = country1.getLiteracyPercent() - country2.getLiteracyPercent();
                if(result == 0) {
                    return 0;
                } else if(result > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }).forEach(country -> System.out.println(country));
      
    }
}
