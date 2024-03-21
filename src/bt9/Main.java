package bt9;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap với các phần tử bên trong
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        // Bước 2: Sử dụng phương thức containsKey() để kiểm tra xem phần tử có tồn tại trong HashMap hay không
        String keyToCheck = "C";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Phần tử '" + keyToCheck + "' tồn tại trong HashMap.");
        } else {
            System.out.println("Phần tử '" + keyToCheck + "' không tồn tại trong HashMap.");
        }
    }

}
