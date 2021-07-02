// Linked List Implementation In Java

import java.util.*;
public class Linklist{
       public static void main(String[] args) {
     
         LinkedList&lt;Integer&gt; intList = new LinkedList&lt;&gt;(Arrays.asList(10,20,30,40,50));
         
         System.out.println("Contents of first LinkedList: " + intList);
        
         
         LinkedList&lt;String&gt; colorsList = new LinkedList&lt;&gt;();
         
         colorsList.add("Red");
         colorsList.add("Green");
         colorsList.add("Blue");
         colorsList.add("Cyan");
         colorsList.add("Magenta");
         
         System.out.println("\nContents of second LinkedList: " + colorsList);
    }
}
