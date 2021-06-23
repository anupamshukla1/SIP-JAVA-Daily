// Java Program to Find the Largest of three Numbers
// ****  Approach 2: Using the if-else statements *****
// 23 june 2021
import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+"is the greatest number");
        }
        else if(num2>=num3 && num2>=num3){
            System.out.println(num2+"is the greatest number");
        }
        else{
            System.out.println(num3+"is the greatest number");
        }
    }
}
