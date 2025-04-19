import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
   public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<>();
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(4);
       reverse(queue);
       System.out.println("Original Queue: " + queue);
   }

   static void reverse(Queue<Integer> queue){
       int first = 0;
       if(!queue.isEmpty()){
           first = queue.remove();
           reverse(queue);
       }else{
           return;
       }
       queue.add(first);
      
    }}