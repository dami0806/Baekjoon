import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3

        int N = Integer.parseInt(br.readLine());
        long dp[][] = new long[(int) Math.max(N+1,3)][10];

        for(int i = 0 ; i<10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            for(int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % 1000000000; // i 자릿수
            }
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
        }
        long sum = 0;
        for(int i = 1 ; i < 10; i ++) {
            sum = (sum+ dp[N][i])%1000000000;
        }
        System.out.println(sum);
    }
}