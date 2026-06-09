package Collection;
import java.util.*;



 public class ArrayQueue {

    public static void main(String[] args) {
         Deque<Integer> q = new ArrayDeque<>();
         q.add(1);
         q.add(2);
         System.out.println(q);

         q.offer(3);
         System.out.println(q);

         
         System.out.println(q.remove());
         //System.out.println(q);

         //System.out.println(q.poll());
         //System.out.println(q.peek());
        // System.out.println(q.element());

        q.push(2); 
        q.push(3);
        System.out.println(q);
         
        q.pop();
        System.out.println(q);
        q.push(19);
        System.out.println(q);

        

    }
}