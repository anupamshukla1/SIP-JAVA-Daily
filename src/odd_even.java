// 22 june 2021
// Java Program to Check if a Given Integer is Odd or Even
// *****  Using Brute Force– Naive Approa
// Java Program to Check if a Given Integer is Odd or Even
//*******   Using Brute Force– Naive Approach   ********
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num+"  Number is even");
        }
        else {
            System.out.println(num+"  Number is odd");
        }
    }

}
