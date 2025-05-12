
import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 1

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			char[] a = st.nextToken().toCharArray(); // acaykp
			char[] b = st.nextToken().toCharArray(); // capcak

			int aLen = a.length;
			int bLen = b.length;

			int dp[][] = new int[aLen][bLen];

			// a==b면 dp[][] =dp[i-1][j-1] +1
			// 다르면 dp[][] = Math.max(dp[i][j-1], dp[i-1][j]);
			// 초기화
			
			if (a[0] == b[0]) {
				dp[0][0] = 1;
			}
			
			for (int i = 1; i < aLen; i++) {
				if (a[i] == b[0]) {
					dp[i][0] = 1;
				}else {
					dp[i][0] = dp[i-1][0];
				}
			}
			
			for (int i = 1; i < bLen; i++) {
				if (a[0] == b[i]) {
					dp[0][i] = 1;
				}else {
					dp[0][i] = dp[0][i-1];
				}
			}
			
			for (int i = 1; i < aLen; i++) {
				for (int j = 1; j < bLen; j++) {
					if (a[i] == b[j]) {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					} else if (a[i] != b[j]) {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					}
				}
			}
				System.out.println("#" + test_case+ " " + dp[aLen-1][bLen-1]);
		}
	}
}
