import java.util.*;
import java.io.*;

public class Solution {
	static int arr[];
	static HashSet<Integer> set;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3

		for (int test_case = 1; test_case <= T; test_case++) {

			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			int N = Integer.parseInt(br.readLine().trim());
			StringBuilder sb = new StringBuilder();
			String answer = " ";
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				if (st.nextToken().equals("1")) {
					int n = Integer.parseInt(st.nextToken());
					pq.offer(n);
				} else {
					if (pq.isEmpty()) {
						sb.append(" ").append("-1");
                    }else{
					sb.append(" ").append(pq.poll());
                    }
				}
			}
			System.out.println("#" + test_case + " " +sb.toString().trim());
		}
	}
}