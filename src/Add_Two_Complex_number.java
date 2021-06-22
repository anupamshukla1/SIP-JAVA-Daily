//22 june 2021
//  Java Program to Add two Complex Numbers
// ***** complex number ****



import java.util.Scanner;

public class Add_Two_Complex_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float real , image;
        System.out.println("For 1st complex number /n");
        System.out.println("Enter the real and imaginary parts:");
        float realn1= sc.nextFloat();
        float imagn1= sc.nextFloat();
        System.out.println("/n For second complex number");
        System.out.println("Enter the real and imaginary parts: ");
        float realn2 = sc.nextFloat();
        float imagn2 = sc.nextFloat();
        System.out.println("Sum ="+(realn1+realn2)+"+i"+(imagn1+imagn2));



    }
}
