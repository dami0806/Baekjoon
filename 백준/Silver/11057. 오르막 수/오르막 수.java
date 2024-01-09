import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        // dp[i][j]일때 i: 자릿수 j: 맨 뒤 숫자
        int n = Integer.parseInt(reader.readLine());
        // i = 0일때
        int[][] dp = new int[n + 1][11];
        // dp[1][j]초기화
        for (int j = 0; j <= 9; j++) {
            dp[1][j] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        int result = 0;
        for (int j = 0; j <= 9; j++) {
            result += dp[n][j];
        }

        result %= 10007;
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
        reader.close();
    }
}