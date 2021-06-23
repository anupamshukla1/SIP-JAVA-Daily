import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int x=1; x<=num; x++){
            if (x==1 || x==0)
                continue;
            int flag=1;
            for (int y =2;y<=x/2;y++){
                if(x % y ==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(x +" ");
            }
        }

    }
}
