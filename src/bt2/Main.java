package bt2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map= new HashMap<>();
        int [] array = {1,2,3,4,4,6,7,6,9,10};
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1 );
            }
        }
        Map<Integer, Integer> newMap= new HashMap<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer value = entry.getValue();
            if (value ==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
