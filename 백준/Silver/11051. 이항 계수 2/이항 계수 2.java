import java.util.*;
import java.io.*;

public class Main {

    static int count;
    static int K;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        count = 0;
        int dp[][] = new int[N+1][N+1];

        for(int i = 1; i<=N; i++){
            dp[i][i] = 1;
            dp[i][0] =1;
        }

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<i; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%10007;
            }
        }

        System.out.println(dp[N][K]);

    }

}