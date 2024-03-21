package bt12;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7, 6, 14, 9, 10};
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tree.put(arr[i], 0);
        }
        tree.remove(tree.lastKey());
        System.out.println("phần tử lớn thứ 2 là " + tree.lastKey());
    }


}
