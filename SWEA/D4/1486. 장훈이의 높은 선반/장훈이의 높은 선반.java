import java.util.*;
import java.io.*;

public class Solution {
	static int N;
	static int target;
	static int arr[];
	static int min;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			target = Integer.parseInt(st.nextToken());
			min = Integer.MAX_VALUE;

			st = new StringTokenizer(br.readLine()); // 1 3 3 5 6
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			dfs(0, 0);
			System.out.println("#" + test_case + " " + min);
		}
	}

	static void dfs(int depth, int sum) {
		if (depth == N) {
			if (sum > target) {
				min = Math.min(min, sum - target);
			}
			return;
		}
		if (sum == target) {
			min = 0;
			return;
		}
		dfs(depth + 1, sum + arr[depth]);
		dfs(depth + 1, sum);
	}
}