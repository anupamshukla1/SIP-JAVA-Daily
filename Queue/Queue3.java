// PriorityQueue 

import java.util.*;
public class Queue3
{ 
   public static void main(String[] args) 
   {
	  Queue<Integer> q2 = new PriorityQueue<Integer>();
	    
      
      q2.add(10);
      q2.add(20); 
      q2.add(30);
      q2.add(40);
      q2.add(50);
  
      System.out.println("Elements in Queue:"+q2);

      System.out.println("Removed element: "+q2.remove());

      System.out.println("Head: "+q2.element());
	    
      System.out.println("poll(): "+q2.poll());

      System.out.println("peek(): "+q2.peek());

      System.out.println("Elements in Queue:"+q2);
   }
}
 
