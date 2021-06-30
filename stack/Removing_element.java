import java.util.Stack;
public class Removing_element {
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
 

   while(st.size() > 0){
	 System.out.println("Removed element: " +st.pop());  
   }
 System.out.println("Is stack empty: " +st.empty());  
 }
}
