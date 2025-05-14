import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3

			st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			boolean[] isPrime = new boolean[B + 1];
			// 처음엔 모두 소수(true)라고 생각해요!
			Arrays.fill(isPrime, true);
			isPrime[0] = false;
			isPrime[1] = false;

			// 0과 1은 소수가 아니니까 false로 바꿔요

			for (int i = 2; i * i <= B; i++) {
				if (isPrime[i]) {
					for (int j = i * i; j <= B; j += i) {
						isPrime[j] = false;
					}
				}
			}

			// 3 10 30
			int count = 0;

			ArrayList<Integer> list = new ArrayList<>();

			for (int i = A; i <= B; i++) {
				if (isPrime[i] == true) {
					int num = i;
					while (num >= D) {
						if (num % 10 == D) {
							list.add(i);
							break;
						}
						num /= 10;
					}
				}
			}
			for (int i : list) {
				count++;

			}
			System.out.println("#"+ test_case + " " + count);

		}
	}

}