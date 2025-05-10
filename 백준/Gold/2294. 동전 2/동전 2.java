import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //3 15
        //1
        //5
        //12
        int N = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        HashSet<Integer> hashset = new HashSet<>();
        int dp[] = new int[goal + 1];

        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(br.readLine());
            hashset.add(p);

        }
        N = hashset.size();
        int coins[] = new int[N + 1];

        int idx = 0;
        for (int i : hashset) {
            coins[idx++] = i;
        }

        // 초기값 주의
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        int min = 100_000;
        for(int coin: coins) {
            for (int i = coin; i <= goal; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        System.out.println(dp[goal] == 10001? -1:dp[goal]);
    }
}

