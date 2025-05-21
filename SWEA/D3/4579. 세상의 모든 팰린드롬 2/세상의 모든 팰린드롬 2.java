import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			String s = br.readLine().trim();
			int len = s.length();
			int idx = len;
			String answer = "Not exist";

			StringBuilder a = new StringBuilder();
			for (int i = 0; i < len; i++) {
				if (s.charAt(i) == '*') {
					idx = Math.min(idx,Math.min(i, len - 1 - i));

				}
			}
			if (idx == -1) {
				// 자체적으로 검사해야
				a.append(st);
				String str = a.toString();
				if (str.equals(a.reverse().toString())) {
					answer = "Exist";
				}

			} else {
				a = new StringBuilder();
				StringBuilder b = new StringBuilder();

				a.append(s.substring(0, idx));
				b.append(s.substring(len - idx, s.length()));
				if (b.toString().equals(a.reverse().toString())) {
					answer = "Exist";
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}