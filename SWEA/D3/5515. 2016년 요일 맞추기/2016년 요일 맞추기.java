import java.util.*;
import java.io.*;

public class Solution {
	static int Days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int days = 0;

			if (m == 1) {
				days = d - 1;
			} else if (m == 2) {
				days = 30 + d;
			} else {
				// 3이면
				for (int i = 0; i < m-1; i++) {
					days += Days[i];
				}
				// m일때는 +d
				days += d - 1;
			}
			int answer = 0;
			switch (days % 7) {
			case 0:
				answer = 4;// 
				break; 
			case 1:
				answer = 5;// 
				break;
			case 2:
				answer = 6;// 
				break;
			case 3:
				answer = 0;// 
				break;
			case 4:
				answer = 1;// 
				break;
			case 5:
				answer = 2;// 
				break;
			case 6:
				answer = 3;// 
				break;
			}

			System.out.println("#" + test_case + " "+ answer);

		}
	}
}