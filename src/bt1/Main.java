package bt1;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map= new HashMap<>();
        int [] array = {1,2,3,4,4,6,7,6,9,10};
//        for (int i = 0; i < array.length; i++) {
//           if (map.containsKey(array[i]))
//        }
        for (int number : array){
            if (map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }else{
                map.put(number,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry :map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Phan tu " + key+ " xuat hien "+value+" lan");
        }

    }
}
