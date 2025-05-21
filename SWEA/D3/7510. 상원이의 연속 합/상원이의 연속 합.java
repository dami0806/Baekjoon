import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for (int i = 1; i <= n; i++) {
				int sum = 0;
				int j = i;
				while (sum <= n) {
					sum += j++;
					if (sum == n) {
						count++;
					}
				}
			}
			System.out.println("#"+test_case + " " + count);
		}
	}
}