import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, ArrayList<String>> invertedMap = new HashMap<>();
        System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(invertedMap.containsKey(entry.getValue())){
                // invertedMap.put(entry.getKey(),(invertedMap.get(entry.getKey())).add(entry.getKey()));
                invertedMap.get(entry.getValue()).add(entry.getKey());
            }
            else{
                invertedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
                invertedMap.get(entry.getValue()).add(entry.getKey());
            }
        }

        System.out.println(invertedMap);
    }    
}