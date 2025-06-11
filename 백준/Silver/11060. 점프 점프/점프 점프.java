import java.util.*;
import java.io.*;

class Main {

	public static void main(String args[]) throws Exception {
		// 5 150
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int arr[] = new int[n];
		int dp[] = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				// arr[i]만큼 이동가능
				if (arr[j] + j >= i && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[j] + 1, dp[i]);
				}

			}
		}
		System.out.println(dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1]);
	}
}