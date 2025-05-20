import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			// 4 5
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			int V[] = new int[N + 1]; // arr[인덱스 ][무게와 가치 ]
			int C[] = new int[N + 1];

			int dp[] = new int[W + 1];// dp[무게 ] = 최대가치

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				V[i] = Integer.parseInt(st.nextToken()); // 0 부피
				C[i] = Integer.parseInt(st.nextToken()); // 1 가치
			}

			// 초기값:
			for (int i = 0; i < N; i++) {
				for (int w = W; w >= V[i]; w--) {
					dp[w] = Math.max(dp[w], dp[w - V[i]] + C[i]); // V[i] 2번째 무게 가 4이면 무게 4+ 무게 1의 가치
				}
			}

			System.out.println("#" + test_case + " " + dp[W]);
		}
	}
}