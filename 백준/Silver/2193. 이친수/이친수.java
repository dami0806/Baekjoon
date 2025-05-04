import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3
        int N = Integer.parseInt(br.readLine().trim());

        long dp[][] = new long[N+1][2];
        dp[1][1]=  1;
        dp[1][0] = 0;



        for(int i = 2; i<=N; i++) {
            dp[i][0] = dp[i-1][1] + dp[i-1][0];
            dp[i][1] = dp[i-1][0];
        }
        System.out.println(dp[N][0] + dp[N][1]);
    }
}