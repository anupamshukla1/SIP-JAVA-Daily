// Java Program to Find the Largest of three Numbers
// Using Ternary operator
// 23 june 2021

import java.util.Scanner;

public class largest_number02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int largest=num3 >(num1>num2 ? num1:num2) ? num3:((num1>num2)? num1:num2);
        System.out.println(largest+" is largest number");
    }
}
