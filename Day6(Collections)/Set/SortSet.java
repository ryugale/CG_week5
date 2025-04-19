import java.util.*;

public class SortSet {
   public static void main(String[] args) {
       Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1,11,10,4,6,13,16,19,16,45,27,36));

       System.out.println(set);

       List<Integer> list = new ArrayList<>(set);
       Collections.sort(list);
       System.out.println(list);
   }
}