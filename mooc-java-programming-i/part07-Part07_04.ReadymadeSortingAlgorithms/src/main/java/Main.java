import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] intArray = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"Piotr", "Ania", "Tomasz", "Basia"};
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        for(int i = 0; i < stringArray.length; i++) {
            intList.add(intArray[i]);
            stringList.add(stringArray[i]);
        }
        
        sort(intArray);
        sort(stringArray);
        sortIntegers(intList);
        sortStrings(stringList);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(intList.toString());
        System.out.println(stringList.toString());
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
