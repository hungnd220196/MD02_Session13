package bt14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7, 6, 14, 9, 10};
        Map<Integer, Integer> tree = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            tree.put(arr[i], 0);
        }
        for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
            System.out.println("key "+ entry.getKey()+ " value " +entry.getValue());
        }
    }
}
