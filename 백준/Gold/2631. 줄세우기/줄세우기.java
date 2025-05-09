import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int person[] = new int[N+1];

        for (int i = 0; i < N; i++) {
            person[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        // 가장 긴 수열 찾기
        Arrays.fill(dp,1);

        for(int i = 1 ; i <N ; i++) {
            for(int j = 0 ; j <i ; j++) {
                if(person[i]>person[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        // 가장 큰 dp?


        // 전체수 - 수열 수
        System.out.println(N-max);
    }
}
