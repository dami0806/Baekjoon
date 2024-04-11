import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); 

        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] score = new int[2][n+1];
            int[][] dp = new int[n+1][3];

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    score[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 1; i <= n; i++) {
                dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + score[0][i];
                dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + score[1][i];
            }

            System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
        }
    }
}
