import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			// 2 3
			long n = Long.parseLong(st.nextToken()); // 2
			long m = Long.parseLong(st.nextToken()); // 3

// ab a
			HashSet<String> set = new HashSet<>();
			long count = 0;
			
			st = new StringTokenizer(br.readLine());
			for(long i = 0 ; i <n ; i++) {
				set.add(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			
			for (long i = 0; i < m; i++) {
				if (set.contains(st.nextToken()))
					count++;

			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}