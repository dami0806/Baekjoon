import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine().trim());

			int sum = 0;// 반지름

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int k = n*n + m*m;
				
				if(k>40000) continue; 
				
				
				
				int score = 0;
				for (int p = 10; p >= 1; p--) {
					int r = 20 * (11 - p); // 반지름
					if (k <= r * r) {
						score = p;
						break;
					}
				}
				sum += score;
			}
			
			//11- R/20
			System.out.println("#" + test_case + " " + sum);
		}
	}
}