package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 7, 7, 7, 9, 1, 1, 1, 3, 4, 5};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++){
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        /*for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }*/
        /*for(Integer key : map.keySet()){
            System.out.println("key = " + key + ", value = " + map.get(key));
        }*/
        /*for(Integer value : map.values()){
            System.out.println("value = " + value);
        }*/
    }
    
}
