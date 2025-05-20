import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine()); // 5 2
			int n = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder();
			int arr[] = new int[n + 1];

			for (int i = 1; i <= c; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken()); // j 로 바꾸
				int end = Integer.parseInt(st.nextToken());

				for (int j = start; j <= end; j++) {
					arr[j] = i;
				}
			}

			for (int i = 1; i <= n; i++) {
				sb.append(arr[i]).append(" ");
			}

			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}