// 22/6/2021
// Java Program to Swap Two Numbers
// *** Swapping the Values Using Third Variable ***


import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two number for swaping :");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
       int temp= num1;
       num1=num2;
       num2=temp;
        System.out.println("num1 :"+num1+" and num2 :"+num2);

    }
}
