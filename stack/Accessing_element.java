import java.util.Stack;
public class Accessing_element{
public static void main(String[] args) 
{

   Stack<Integer> st = new Stack<>();
   
   st.push(25);
   st.push(30);
   st.push(35);
   st.push(40);
   st.push(45);
   st.push(50);
   

   System.out.println("Elements of Stack: " +st);
  

   Object peekElement = st.peek();
   System.out.println("Element at the top of stack: " +peekElement);
   

   System.out.println("Position of element 50: " +st.search(50));
   System.out.println("Position of element 80: " +st.search(80));
 }
}
