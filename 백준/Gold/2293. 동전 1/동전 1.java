import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 3
        int k = Integer.parseInt(st.nextToken()); // 10

        int coins[] = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine()); // 1 2 5
        }
        int dp[] = new int[k + 1];

        dp[0] = 1;

        for (int coin : coins) {// 1 2 5
            for (int i = coin; i <= k; i++) {
                dp[i] = dp[i] + dp[i - coin];
            }
        }
        System.out.println(dp[k]);
    }
}