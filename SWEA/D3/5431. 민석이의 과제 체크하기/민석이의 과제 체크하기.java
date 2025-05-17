import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			// 5 3
			st = new StringTokenizer(br.readLine()); // 5, 3
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder();
			// 2 5 3
			HashSet<Integer> set = new HashSet<>();
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= M; i++) {
				set.add(Integer.parseInt(st.nextToken()));
			}
			for (int i = 1; i <= N; i++) {
				if(!set.contains(i)) {
					sb.append(i).append(" ");
				}
			}

			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}