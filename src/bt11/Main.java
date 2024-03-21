package bt11;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Sắp xếp một mảng các phần tử nguyên theo thứ tự tăng dần
        int[] array = {5, 2, 9, 1, 3};
        Arrays.sort(array);

        // Bước 2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 3: Đưa các phần tử của mảng vào TreeMap
        for (int num : array) {
            treeMap.put(num, 0);
        }

        // Bước 4: In ra các phần tử trong TreeMap
        System.out.println("Các phần tử trong TreeMap (đã sắp xếp tăng dần):");
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
