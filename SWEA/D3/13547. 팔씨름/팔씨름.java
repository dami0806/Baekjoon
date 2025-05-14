import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3

			String s = br.readLine();
			int count = 0;
			String answer = "YES";
			for (char c : s.toCharArray()) {
				if (c == 'x') {
					count++;
				}
			}
			if (count > 7) {
				answer = "NO";
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}