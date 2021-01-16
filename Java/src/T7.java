import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class T7 {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long minElement = 0, maxElement = 0, sum = 0;
        sum = maxElement = minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < minElement) {
                minElement = arr[i];
            } else if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        System.out.println((sum - maxElement) + " " + (sum - minElement));
    }

    //    Short solution
    //    static void miniMaxSum(int[] arr) {
    //        IntStream stream = IntStream.of(arr);
    //        System.out.printf("%s %s", stream.sum()-stream.max().getAsInt(), stream.sum()-stream.min().getAsInt());
    //    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}