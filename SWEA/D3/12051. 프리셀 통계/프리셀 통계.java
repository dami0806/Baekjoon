
import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 1

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			long N = Long.parseLong(st.nextToken()); // N, PD, PG
			int PD = Integer.parseInt(st.nextToken());
			int PG = Integer.parseInt(st.nextToken());
			String answer = "Possible";
			// 1. D는 100/ pcd(Dp,100)의 최대공약수의 배수

			// 2. PG == 0 이면 pD는 >0이 broken
			// 3. PG== 100이면 pD는 <100이면 broken

			int D = 100 / gcd(PD, 100);// 의 배수이자 N보다 작은 수여야 함.
			// 정수를 곱해서 N 보다 작을때까지해보기 가능하면 됨
			// 100/gcd(PD,100)*1도 가능할테니 이게 N보다 작거나 같은 정수면 됨

			if (D > N || (PG == 100 && PD < 100) || (PG == 0 && PD > 0)) {
				answer = "Broken";

			}
			System.out.println("#" + test_case + " " + answer);
		}
	}

	// Dp, 100의 최대 공약수 만들기
	static int gcd(int a, int b) { // a는 몫, b는 나머지가 되서
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);

	}
}