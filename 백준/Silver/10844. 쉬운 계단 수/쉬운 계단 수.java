import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final long MOD = 1000000000;
        long[][] dp = new long[N+1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][1];
            for (int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
            }
            dp[i][9] = dp[i-1][8];
        }

        long sum = 0;
        for (int j = 0; j < 10; j++) {
            sum = (sum + dp[N][j]) % MOD;
        }

        System.out.println(sum);
    }
}
