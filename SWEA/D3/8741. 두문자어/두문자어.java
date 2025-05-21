import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// knuth morris pratt
			StringBuilder sb = new StringBuilder();
			while (st.hasMoreTokens()) {
				String s = st.nextToken().toUpperCase();
				sb.append(s.charAt(0));
			}

			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}