import java.util.*;
public class Binary {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number to generate Binary: ");
       int num = sc.nextInt();
       printBinary(num);
   }

   static void printBinary(int n){
       Queue<String> queue = new LinkedList<>();
       queue.add("1");
       int count = 0;
       String first;
       System.out.print("[");
       for(int i=1; i<=n; i++){
           first = queue.poll();
           System.out.print("\""+first+"\" , ");


           queue.add(first + "0");
           queue.add(first + "1");
       }
       System.out.print("]");
   }
}