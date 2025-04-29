import java.util.*;
import java.io.*;

public class Main {
    static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N+1][3]; // 0 없다 1: 왼쪽 2: 오른쪽

        if(N==1){
            System.out.println(3);
            return;
        }

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for(int i = 2 ;i<=N;i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % 9901;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % 9901;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % 9901;
        }
        int sum = (dp[N][0]+ dp[N][1]+ dp[N][2]) % 9901;
        System.out.println(sum);
    }
}