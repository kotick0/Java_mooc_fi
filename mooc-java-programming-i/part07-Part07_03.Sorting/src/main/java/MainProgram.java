import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices: 0 1 2 3 4
        // int[] numbers = { -1, 6, 9, 8, 12 };
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallestNumber = smallest(array);
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            // System.out.println(indexOfSmallestFrom(array, index));
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index += 1;
        }
    }
}
