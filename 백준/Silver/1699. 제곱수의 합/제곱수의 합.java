import java.util.*;
import java.io.*;

public class Main {
    static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int sqrtN = (int) Math.sqrt(N);
        int[] dp = new int[N + 1];

        if (N <= 1) {
            System.out.println(1);
            return;
        }
        if (N <= 2) {
            System.out.println(2);
            return;
        }

        //초기화
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        int min = N;

        for (int i = 1; i <= sqrtN; i++) {
            dp[i * i] = 1;
        }
        int k = 3;

        while (k <= N) {
            if(dp[k] == 0) dp[k] = N;
            for (int i = 1; i <= (int)Math.sqrt(k); i++) {
                dp[k] = Math.min(dp[i * i] + dp[k - i * i], dp[k]);
            }
            k++;
        }
        System.out.println(dp[N]);
    }
}