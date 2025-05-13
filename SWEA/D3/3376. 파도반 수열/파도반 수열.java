import java.util.*;
import java.io.*;

public class Solution {
	static int Days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
// 1, 1, 1, 2, 2, 3, 4, 5, 7, 9

			long dp[] = new long[Math.max(3, N)];
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;
			
			for(int i = 3 ;i<N; i++) {
				dp[i]= dp[i-2]+dp[i-3];
			}
			
			System.out.println("#" + test_case + " " + dp[N-1]);

		}
	}
}