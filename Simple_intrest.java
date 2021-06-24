import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the p,q and t value : ");
        int p= sc.nextInt();
        int r= sc.nextInt();
        int t= sc.nextInt();
        float si=p*r*t/100;
        System.out.println("Simple intrest is :"+ si);
    }
}
