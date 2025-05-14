import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3

			st = new StringTokenizer(br.readLine());
			// 0 1 2
			int a = 0;
			int b = 0;
			int c = 0;

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			double k = (Math.abs((a + c) - 2 * b) * 0.5);

			k = Math.round(k * 10) / 10.0;
			System.out.println("#" + test_case+ " " +k);
		}
	}
}