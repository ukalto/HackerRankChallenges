import java.io.*;
import java.math.*;
import java.text.*;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.*;

public class T9 {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        if (s.substring(8, 10).equals("PM") && hours != 12) {
            hours += 12;
        } else if (s.substring(8, 10).equals("AM") && hours == 12) {
            hours = 0;
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();

        Scanner sc = new Scanner(System.in);

        String d = sc.next();

        try {
            DateFormat df = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = df.parse(d);
            System.out.println(out.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}