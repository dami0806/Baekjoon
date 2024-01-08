import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] dp = new int[n + 1];
        int[] wine = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(reader.readLine());
        }
        // int dp[i] = max(dp[i-1], dp[i-2]+wine[i], dp[i-3]+wine[i-1], wine[i])
        dp[1] = wine[1];
        if (n>1){
        dp[2] = wine[1] + wine[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));

        }
        writer.write(Integer.toString(dp[n]));
        writer.flush();
        writer.close();
        reader.close();
    }
}