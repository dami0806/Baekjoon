import java.util.*;
import java.io.*;

public class Solution {
	static char board[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[N];
			int dp[] = new int[N];

			st = new StringTokenizer(br.readLine());
			
			
			int min = 0;
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				min = Math.min(arr[i], min);
			}
			
			int max = min;
			
			Arrays.fill(dp, min);
			
			dp[0] = arr[0];

			for (int i = 1; i < N; i++) {
				dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
				max = Math.max(max, dp[i]);
			}
			System.out.println("#" + test_case + " " + Math.max(max,dp[0]));
		}
	}
}