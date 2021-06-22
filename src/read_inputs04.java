// 22/06/2021
// Ques 2.Ways to read input from console in Java

// 04 - Using Command line argument

public class read_inputs04 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(
                    "The command line arguments are:");
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                    + "arguments found.");

    }
}
