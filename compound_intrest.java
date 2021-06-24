// 24 june 2021
// Java Program for compound interest

import java.util.Scanner;

public class compound_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pricipal amount , rate and time :");
        double P = sc.nextFloat();
        double R = sc.nextFloat();
        double T = sc.nextFloat();
     double ci= P*(Math.pow((1+R/100),T));
        System.out.println("Compound intrest is : "+ci);
    }
}
