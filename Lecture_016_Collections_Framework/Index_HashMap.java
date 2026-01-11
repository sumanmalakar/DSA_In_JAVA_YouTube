import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Index_HashMap {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> map = new TreeMap<>();

        map.put(10,"Java");
        map.put(2,"Python");
        map.put(30,"JavaScript");
        map.put(4,"Suman");


        map.forEach((key,values)->System.out.println(key+" -> "+values));


        // for(Map.Entry<Integer,String>entry : map.entrySet()){
        //     System.out.println(entry.getKey()+" -> "+entry.getValue());
        // }



        // for(String val : map.values()){
        //     System.out.println(val);
        // }

        // for(Integer key : map.keySet())
        // {
        //     System.out.println(key);
        // }

        // System.out.println(map);
        // System.out.println(map.get(3));
        // // System.out.println(map.getOrDefault(5,"Best DSA Course"));
        // System.out.println(map.containsKey(10));
        // System.out.println(map.containsValue("java"));
    }
}
