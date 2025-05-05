import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3
        int N = Integer.parseInt(br.readLine().trim());//9

        int dp[] = new int[Math.max(N+1,3)];

        int M = Integer.parseInt(br.readLine().trim());//2
        int arr[] = new int[M];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3 ; i <= N; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        int answer =1;

        if(M != 0) {
            for (int i = 0; i < M; i++) {
                arr[i] = Integer.parseInt(br.readLine().trim()); //4 7  -> 4, 7
            }

            Arrays.sort(arr);
            answer *= dp[arr[0] - 1];

            answer *= dp[N - arr[M - 1]];


            for (int i = 0; i < M - 1; i++) {
                answer *= dp[arr[i + 1] - arr[i] - 1];
            }
        }
        else{
            answer = dp[N];
        }

        System.out.println(answer);
    }
}