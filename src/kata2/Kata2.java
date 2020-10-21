package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 7, 7, 7, 9, 1, 1, 1, 3, 4, 5};
        
        Histogram meta_histogram = new Histogram(data);  
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        
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
