import java.util.*;
public class RotateList {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number to rotate that times: ");
       num = sc.nextInt();
       for(int i=0; i<num;i++){
           list.add(list.removeFirst());
          
       }
       System.out.println(list);

   }
}