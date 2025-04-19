import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymetricDIff {
   public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
       Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7));

       Set<Integer> temp1 = new HashSet<>(set1);
       Set<Integer> temp2 = new HashSet<>(set2);

       temp1.removeAll(set2);
       temp2.removeAll(set1);

       temp1.addAll(temp2);
       
       System.out.println("Symmetric Difference: " + temp1);
   }
}