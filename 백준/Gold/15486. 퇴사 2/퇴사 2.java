import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 7

        // 2 15
        // 4 40
        int arr[][] = new int[N+1][2];
        for(int i = 0 ;i <N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int dp[] = new int[N + 2];
        int max = 0;

        for (int i = 0; i <= N; i++) {

            // i일에 안하면 i+1일은 i일을 그대로 받는다
            dp[i+1] = Math.max(dp[i],dp[i+1]);

            if (i + arr[i][0] <= N) {// 상담을 할수 있다면?
                dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]],dp[i] + arr[i][1]);
            }// 할수 없다면?

            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}

