import java.util.Scanner;

public interface prime02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int flg =1;
        for(int x=1; x<=num;x++) {
            if(x==1 || x==0)
                continue;
           int flag=1;
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;

                }

            }
            if (flag == 1)
                System.out.print(x + " ");
        }
    }
}
