import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 20 2
        int N = Integer.parseInt(st.nextToken());
        int board[][] = new int[N][N];
        long dp[][] = new long[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int k = board[i][j];
                if (k == 0) continue;

                if (i + k < N) dp[i + k][j] += dp[i][j];
                if (j + k < N) dp[i][j + k] += dp[i][j];
            }
        }
        System.out.println(dp[N - 1][N - 1]);
    }
}