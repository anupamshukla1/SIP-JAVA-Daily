// Traverse/Print Linked List In Java


import java.util.LinkedList;

class Linklist2 {
    public static void main(String[] args) {
        
        LinkedList&lt;String&gt; colorList = new LinkedList&lt;&gt;();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        
        
        System.out.println("LinkedList elements using for loop:");
        for(int i=0; i &lt; colorList.size(); i++) {
            System.out.print(colorList.get(i) + " ");
        }
    }
}
