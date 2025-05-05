import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3
        int N = Integer.parseInt(br.readLine().trim());

        int dp[][] = new int[N+1][3];
        int board[][] = new int[N+1][3];


        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<3; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = board[0][0];
        dp[0][1] = board[0][1];
        dp[0][2] = board[0][2];

        for(int i = 1 ; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + board[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + board[i][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][0]) + board[i][2];
        }
        System.out.println(Math.min(Math.min(dp[N-1][0],dp[N-1][1]),dp[N-1][2]));

    }
}