import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());// 3
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken()); //2
            int coins[] = new int[count];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; i++) {
                coins[i] = Integer.parseInt(st.nextToken()); //1 2
            }

            st = new StringTokenizer(br.readLine());
            int goal = Integer.parseInt(st.nextToken()); //1000
            int dp[] = new int[goal + 1];

            dp[0] = 1;

            for (int j = 0; j < count; j++) {
                for (int i = coins[j]; i <= goal; i++) {
                    if (i - coins[j] < 0) continue;
                    dp[i] += dp[i - coins[j]];
                }
            }
            System.out.println(dp[goal]);
        }
    }
}
