import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			String answer = "DIFF";
			// ADOPQR ->1
			// CEFGHIJKLMNSTUVWXYZ->0
			// B ->2
			st = new StringTokenizer(br.readLine());
			String front = st.nextToken();// ABCD
			String back = st.nextToken(); // EFGH
			StringBuilder sb_front = new StringBuilder();
			StringBuilder sb_back = new StringBuilder();
			
			for (char c : front.toCharArray()) {
				if (c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'|| c=='R') {
					sb_front.append(1);
				}else if(c== 'B') {
					sb_front.append(2);
				}else {
					sb_front.append(0);
				}
			}
			for (char c : back.toCharArray()) {
				if (c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R') {
					sb_back.append(1);
				}else if(c== 'B') {
					sb_back.append(2);
				}else {
					sb_back.append(0);
				}
			}
			if(sb_front.toString().equals(sb_back.toString())) {
				answer = "SAME";
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}