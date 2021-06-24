//24 june 2021
// ** Java Program to Find the Perimeter of a Rectangle **

import java.util.Scanner;

public class perimeter_of_a_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rectangle slides value : ");
        System.out.println("Enter value of a : ");
        double a= sc.nextDouble();
        System.out.println("Enter value of b : ");
        double b= sc.nextDouble();
        System.out.println("Enter value of c : ");
        double c = sc.nextDouble();
        System.out.println("Enter value of d : ");
        double d = sc.nextDouble();
        if(a==c && b==d){
            double peri =(2*a+2*b);
            System.out.println("perimeter of rectangle is "+peri);
        }
        else{
            System.out.println("** Invalid Input **");
        }
    }
}
