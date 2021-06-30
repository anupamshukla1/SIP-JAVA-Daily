import java.util.Stack;
public class StackEx {
public static void main(String[] args) 
{

   Stack<String> st = new Stack<>();
   

   boolean empty = st.empty();
   System.out.println("Is stack empty: " +empty);
   

   st.push("Sunday");
   st.push("Monday");
   st.push("Tuesday");
   st.push("Wednesday");
   st.push("Thursday");
   st.push("Friday");
   st.push("Saturday");
   

   System.out.println("Elements of Stack: " +st);
 }
}
