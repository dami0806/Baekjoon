import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int answer = 0;

        for(int i =  0; i<N; i++){
            answer = 0;

            int n = scan.nextInt(); // 4 3 10
            int dp[][] = new int[Math.max(n+1,4)][4]; // 1 2 3

            dp[1][1] = 1;
            dp[1][2] = 0;
            dp[1][3] = 0;

            dp[2][1] = 1;
            dp[2][2] = 1;
            dp[2][3] = 0;

            dp[3][1] = 1;
            dp[3][2] = 1;
            dp[3][3] = 1;

            for(int j = 4; j<=n; j++) {
                dp[j][1] = dp[j-1][1];
                dp[j][2] = dp[j-2][1] + dp[j-2][2];
                dp[j][3] = dp[j-3][1] + dp[j-3][2]+ dp[j-3][3];
            }
            answer = dp[n][1] + dp[n][2] + dp[n][3];
            System.out.println(answer);
        }
    }
}