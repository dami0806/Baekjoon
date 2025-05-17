import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());

			int total_a = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int total_b = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String answer = " ";
			double a_result = total_a * 1.0 / a;
			double b_result = total_b * 1.0 / b;

			
			if (a_result == b_result) {
				answer = "DRAW";
			} else if (a_result > b_result) {
				answer = "ALICE";
			} else {
				answer = "BOB";
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}