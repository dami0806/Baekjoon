
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char c =line.charAt(0);
        // 11101101
        int count1 =0;
        int count0 =0;

        char prev = line.charAt(0);
        if (prev == '0') count0++;
        else count1++;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) != prev) {
                if (line.charAt(i) == '0') count0++;
                else count1++;
                prev = line.charAt(i);
            }
        }


        System.out.println(Math.min(count0, count1));
    }
}