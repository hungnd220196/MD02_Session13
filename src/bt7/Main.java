package bt7;

import java.util.HashMap;

public class Main {

        public static void main(String[] args) {
            // Bước 1: Khai báo và khởi tạo HashMap gốc và tạo dữ liệu
            HashMap<String, Integer> originalHashMap = new HashMap<>();
            originalHashMap.put("A", 1);
            originalHashMap.put("B", 2);
            originalHashMap.put("C", 3);
            originalHashMap.put("D", 4);

            // Bước 2: Khai báo một HashMap mới và sao chép tất cả các phần tử từ HashMap gốc vào HashMap mới
            HashMap<String, Integer> copiedHashMap = new HashMap<>();
            copiedHashMap.putAll(originalHashMap);

            // Bước 3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
            System.out.println("HashMap gốc:");
            System.out.println(originalHashMap);

            System.out.println("HashMap sau khi sao chép:");
            System.out.println(copiedHashMap);

            // Kiểm tra xem các phần tử có giống nhau không
            boolean isEqual = originalHashMap.equals(copiedHashMap);
            if (isEqual) {
                System.out.println("HashMap đã được sao chép chính xác.");
            } else {
                System.out.println("Có lỗi xảy ra trong quá trình sao chép HashMap.");
            }
        }

}
