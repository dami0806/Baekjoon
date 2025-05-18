import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			// abcba
			String s = br.readLine().trim();
			StringBuilder sb = new StringBuilder();
			String answer = "NO";

			int N = s.length();
			if (N % 2 == 1) {
				sb.append(s.substring(0, (N - 1) / 2 )); // (N-1)/2 까지보기

				String bigo = s.substring(N- ((N - 1) / 2));
				
				if (sb.toString().equals(bigo)) {
					answer = "YES";
				}
			}
			else {
				sb.append(s);
				sb.reverse();
				if (sb.toString().equals(s)) {
					answer = "YES";
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}

}