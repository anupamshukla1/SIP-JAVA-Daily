import java.util.Scanner;

// 24 june 2021
// find neon number in given by user

import  java.util.Scanner;
public class Check_Neon_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number : ");
        int n= sc.nextInt();
        int square = n*n;
        int sum =0;
        while(square >0){
            int r = square%10;
            sum=sum+r;
            square=square/10;

        }
        if(sum==n){
            System.out.println(n+" Number is neon ");
        }
        else{
            System.out.println(n+" Number is not neon ");
        }
    }
}
