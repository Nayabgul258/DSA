package Collection;
import java.util.*;

import java.util.Queue;

public class QueueBasic {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(10);
    q.add(20);
    System.out.println(q);

    q.offer(30);
    System.out.println(q);

    System.out.println(q.element());
    System.out.println(q.peek());

    System.out.println(q.remove(30));
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    
    


  }
    
}