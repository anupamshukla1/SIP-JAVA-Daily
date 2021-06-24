import java.util.Scanner;

public class check_vowel_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter  character : ");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c+"  Character is vowel");
        }
        else{
            System.out.println(c+" Character is consonant");
        }
    }
}
