import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			String[] str = new String[5];
			int maxLen = 0;
			for (int i = 0; i < 5; i++) {
				str[i] = br.readLine().trim();
				maxLen = Math.max(maxLen, str[i].length());
			}
			int idx = 0;
			StringBuilder sb = new StringBuilder();
			
			while (idx < maxLen) {
				for (int i = 0; i < 5; i++) {

					if (str[i].length() <= idx)
						continue;
					sb.append(str[i].charAt(idx));
				}
				idx++;
			}
			System.out.println("#" + test_case + " "+ sb.toString());
		}
	}
}