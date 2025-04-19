import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        map1.put('A', 1);
        map1.put('B', 1);
        map1.put('C', 1);
        map1.put('B', 1);
        map1.put('F', 1);

        map2.put('A', 3);
        map2.put('B', 3);
        map2.put('B', 3);
        map2.put('F', 3);
        map2.put('B', 3);
        map1.put('C', 2);

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                map2.put(entry.getKey(), map2.get(entry.getKey()) + entry.getValue());
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(map2);

    }
}