import java.util.*;
public class ReverseList{
   public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
       LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(2);
       list2.add(3);
       list2.add(4);
       list2.add(5);

       Collections.reverse(list);
       Collections.reverse(list2);
       System.out.println(list);
       System.out.println(list2);
   }
}