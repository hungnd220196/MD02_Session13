package bt15;

import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {
        // Bước 1: Khởi tạo TreeMap và thêm các phần tử
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(2, "C");
        treeMap.put(3, "B");
        treeMap.put(4, "D");

        // Bước 2: In ra TreeMap để kiểm tra trước khi xóa
        System.out.println("TreeMap trước khi xóa:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Bước 3: Thực hiện xóa bằng phương thức remove()
        int keyToRemove = 2;
        treeMap.remove(keyToRemove);

        // Bước 4: In ra TreeMap để kiểm tra sau khi xóa
        System.out.println("\nTreeMap sau khi xóa:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
