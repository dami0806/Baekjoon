import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1로 끝나면 dp[n][1] = dp[n-1][0]
        // 0로 끝나면  dp[N-2][0]+ dp[N-2][1]
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][2];

        dp[1][0] = 0;
        dp[1][1] = 1;

        if (N > 1) {
            dp[2][0] = 1;
            dp[2][1] = 1;
        }

        for (int i = 3; i <= N; i++) {
            dp[i][0] = (dp[i - 2][0] + dp[i - 2][1]) % 15746;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % 15746;
        }
        System.out.println((dp[N][0] + dp[N][1]) % 15746);
    }
}