import java.util.*;

class StackWithQueue{
   private Queue<Integer> queue1;
   private Queue<Integer> queue2;

   StackWithQueue(){
       queue1 = new LinkedList<>();
       queue2 = new LinkedList<>();
   }

   void push(int num){
       queue1.add(num);
   }

   int pop(){
       if(!queue1.isEmpty()){
           while(queue1.size()>1){
               queue2.add(queue1.poll());
           }

           int poped = queue1.poll();

           Queue<Integer> temp = queue1;
           queue1 = queue2;
           queue2 = temp;
           return poped;

       }
       return 0;

   }
}

public class StackUsingQueues {
   public static void main(String[] args) {
       StackWithQueue stack = new StackWithQueue();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);

       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
   }
}