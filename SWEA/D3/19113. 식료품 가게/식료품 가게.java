import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 2

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 3
			long []arr = new long[n];
			
			ArrayList<Long> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine()); // 15 20 60 75 80 100

			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < n*2; i++) {
				list.add(Long.parseLong(st.nextToken()));
			}

			Collections.sort(list, Collections.reverseOrder());

			for (int i = 0; i < n; i++) {
		//	while(list.isEmpty()) {
				long cost = list.get(0) * 3 / 4;

				if (list.contains(cost)) {
					list.remove(list.get(0));
					arr[n-i-1]= cost;
					list.remove(Long.valueOf(cost));
				}
			}
			for(int i  = 0 ; i<n ;i++) {
				sb.append(arr[i]).append(" ");
			}

			System.out.println("#" + test_case + " " + sb.toString());

		}
	}
}