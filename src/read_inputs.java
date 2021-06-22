// 22/06/21
// Ques 2. Ways to read input from console in Java

// 1- Using Buffered Reader Class


import java.util.Scanner;

 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  import java.util.Scanner;

public class read_inputs {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String value1 = reader.readLine();
        System.out.println(value1);
    }
}





