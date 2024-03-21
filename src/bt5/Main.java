package bt5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("A", 10);
        hashMap.put("B", 5);
        hashMap.put("C", 8);
        hashMap.put("D", 3);
        hashMap.put("E", 12);

        // Bước 2: Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        System.out.println("mảng trước sắp xếp");
        for (Map.Entry<String, Integer> entry : list) {

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



        // Bước 3: Sắp xếp danh sách các phần tử theo giá trị tăng dần
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        // Bước 4: In ra các phần tử và giá trị của chúng theo thứ tự tăng dần
        System.out.println("HashMap sau khi được sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
