import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class T6 {
    //After Java 11 this works:
    //    static void staircase(int n) {
    //        for (int i = 1; i <= n; i++) {
    //            System.out.println(" ".repeat((n-i))+"#".repeat(i));
    //        }
    //    }
    // Complete the staircase function below.
    static void staircase(int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((n - (j + i)) <= 0) output += "#";
                else output += " ";
            }
            System.out.println(output);
            output = "";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}