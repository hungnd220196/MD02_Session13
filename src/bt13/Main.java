package bt13;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo một đối tượng TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Bước 2: Đưa các phần tử vào TreeMap
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(9, "Nine");
        treeMap.put(1, "One");
        treeMap.put(3, "Three");

        // Bước 3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap
        Map.Entry<Integer, String> minEntry = treeMap.firstEntry();

        // Kiểm tra xem TreeMap có phần tử không
        if (minEntry != null) {
            System.out.println("Phần tử nhỏ nhất trong TreeMap:");
            System.out.println("Key: " + minEntry.getKey() + ", Value: " + minEntry.getValue());
        } else {
            System.out.println("TreeMap trống.");
        }
    }


}
