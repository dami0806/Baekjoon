import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 20 2
        final int mod = 1_000_000_000;

        int num = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

       int dp[][] = new int[num+1][count+1];

       for(int i = 0 ; i <= num; i++) {
           dp[i][1] = 1;
       }

       for(int j = 0; j <= count; j++) {
           dp[0][j] = 1;

       }

       for(int i = 1 ; i <= num; i++) {
           for(int j = 1 ; j <= count; j++) {
               dp[i][j] = (dp[i-1][j]+ dp[i][j-1] )% mod;
           }
       }
        System.out.println(dp[num][count]);

    }
}