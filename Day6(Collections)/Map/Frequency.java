import java.util.*;
public class Frequency {
   public static void main(String[] args) {
       Map<String, Integer> map = new HashMap<>();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Scentence: ");
       String scentence = sc.nextLine();
       String input[] = scentence.split(" ");;
       for(String str: input){
           if(map.containsKey(str)){
               map.put(str, map.get(str) + 1);
           }
           else
               map.put(str,1);
       }
       System.out.println(map);
   }
}