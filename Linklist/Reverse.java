// Reverse Linked List In Java


import java.util.*;  
public class Reverse {  
 public static void main(String args[]){  
    
    LinkedList&lt;String&gt; l_list=new LinkedList&lt;String&gt;();  
    l_list.add("Pune");  
    l_list.add("Mumbai");  
    l_list.add("Nagpur");  
    System.out.println("Linked List : " + l_list);
    System.out.println("Linked List in reverse order:");
    
    Iterator iter=l_list.descendingIterator();  
    
    while(iter.hasNext())  
    {  
        System.out.print(iter.next() + " ");  
    }  
 }  
}  
