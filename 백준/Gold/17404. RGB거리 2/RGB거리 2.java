import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 6
        //30 19 5
        //64 77 64
        //15 19 97
        //4 71 57
        //90 86 84
        //93 32 91

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }


        final int INF = 1_000_000_000;
        int answer = INF;

        for (int first = 0; first < 3; first++) {

            int[][] dp = new int[N][3];

            for (int k = 0; k < 3; k++) {
                dp[0][k] = (k == first) ? arr[0][k] : INF;
            }

            for (int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + arr[i][2];
            }

            // 마지막 집
            for (int last = 0; last < 3; last++) {
                if (last == first) continue;
                answer = Math.min(dp[N-1][last], answer);
            }
        }

        System.out.println(answer);
    }
}

