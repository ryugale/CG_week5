import java.util.*;
public class FindElement {
   public static void main(String[] args) {
       LinkedList<Character> LL = new LinkedList<>();

       LL.add('A');
       LL.add('B');
       LL.add('C');
       LL.add('D');
       LL.add('E');
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number to get from last: ");
       int num = sc.nextInt();

       int indexToRemove = LL.size() - num;
       LL.remove(indexToRemove);
       System.out.println(LL);
   }
}