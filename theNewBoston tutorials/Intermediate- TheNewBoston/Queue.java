import java.util.*;

public class Queue{
   public static void main(String[] args){
      
      PriorityQueue<String> q = new PriorityQueue<String>();
      
      q.offer("First");
      q.offer("Second");
      q.offer("Third");
      
      System.out.printf("%s ", q);
      System.out.println();
      
      System.out.printf("%s ", q.peek());//returns element with highest priority
      System.out.println();
      
      q.poll();//removes highest priority
      System.out.printf("%s ", q);
   }
}