import java.util.*;
import java.io.*;

public class Solution {
	static char[][] board;
	static String answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			board = new char[8][8];
			// 보드 만들기
			for (int i = 0; i < 8; i++) {
				String s = br.readLine().trim();
				for (int j = 0; j < 8; j++) {
					board[i][j] = s.charAt(j);
				}
			}
			answer = "no";
			// O.
			check();

			System.out.println("#" + test_case + " " + answer);
		}
	}

	static void check() {
		int count =0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'O') {// 공격 가능한 경우
					// 오른쪽과 아래만 보자
					count++;
					if(count > 8) return;
					int m = j+1;
					while (m < 8) {
						if (board[i][m++] == 'O') {
							return;
						}
					}
					m = j;
					int n = i+1;
					while (n < 8) {
						if (board[n++][j] == 'O') {
							return;
						}
					}
					n = i;

				}
			}
		}
		if(count == 8) {
		answer = "yes";
            return;
		}
	}
}