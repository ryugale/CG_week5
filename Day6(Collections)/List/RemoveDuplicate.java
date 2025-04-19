import java.util.*;

public class RemoveDuplicate {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4,5,6,7,5,4,3,8,6,4,5,6));


       Set<Integer> set = new HashSet<>();
       for (int i = 0; i < list.size(); i++) {
           if (set.contains(list.get(i))) {
               list.remove(i--);
           } else
               set.add(list.get(i));
       }
       System.out.println(list);

   }
}