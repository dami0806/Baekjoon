import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			int N = Integer.parseInt(br.readLine().trim());
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < N; i++) {
				String line = br.readLine();
				if (line == null || line.isEmpty()) {
					continue; // 입력 부족 방지
				}
				StringTokenizer st = new StringTokenizer(line);
				String command = st.nextToken();

				if (command.equals("1")) {
					int n = Integer.parseInt(st.nextToken());
					pq.offer(n);
				} else {
					if (pq.isEmpty()) {
						sb.append("-1 ");
					} else {
						sb.append(pq.poll()).append(" ");
					}
				}
			}
			System.out.println("#" + test_case + " " + sb.toString().trim());
		}
	}
}
