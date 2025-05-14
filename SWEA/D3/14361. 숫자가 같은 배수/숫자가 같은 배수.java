import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3

			int a = Integer.parseInt(br.readLine().trim());
			int n = a;

			List<Integer> list_a = new ArrayList<>();
			List<Integer> list_b = new ArrayList<>();
			String answer = "impossible";

			while (n > 0) {
				list_a.add(n % 10);
				n /= 10;
			}

			Collections.sort(list_a);

			for (int k = 2; k < 10; k++) {
				list_b = new ArrayList<>();
				int b = a * k;

				while (b > 0) {
					list_b.add(b % 10);
					b /= 10;
				}

				Collections.sort(list_b);

				if (list_b.equals(list_a)) {
					answer = "possible";
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}