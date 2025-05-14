import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		int N = 999;
		boolean prime[] = new boolean[N+1];
		Arrays.fill(prime, true);

		prime[0] = false;
		prime[1] = false;

		for (int i = 2; i * i <= N; i++) {
			if (prime[i]) {
				for (int j = i * i; j <= N; j += i) {
					prime[j] = false;
				}
			}
		}

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			int count = 0;
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());

			for (int i = 2; i <= a; i++) {
				if (!prime[i])
					continue;

				for (int j = i; j <= a; j++) {
					if (!prime[j])
						continue;
					for (int k = j; k <= a; k++) {
						if (!prime[k])
							continue;
						int sum = i + j + k;
						if (sum > a)
							break;
						if (sum == a) {
							count++;
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}