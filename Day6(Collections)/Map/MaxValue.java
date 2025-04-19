import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 20);
        map.put('C', 99);
        map.put('D', 22);
        Map.Entry<Character, Integer> max = map.entrySet().iterator().next();
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(max.getValue() < entry.getValue()){
                max = entry;
            }
        }
        System.out.println(max.getKey());

    }
}