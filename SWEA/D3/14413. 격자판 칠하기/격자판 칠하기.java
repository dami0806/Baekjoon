import java.util.*;
import java.io.*;

public class Solution {
	static char[][] board;
	static String answer = "possible";
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			answer = "possible";

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			board = new char[N][M];

			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < M; j++) {
					board[i][j] = s.charAt(j);
				}
			}
			answer = (isValid('.', '#') || isValid('#', '.')) ? "possible" : "impossible";
			System.out.println("#" + test_case + " " + answer);
		}
	}

	// 색1, 색2로 시작하는 체커보드 패턴이 가능한지 확인
	static boolean isValid(char color1, char color2) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				char color = ((i + j) % 2 == 0) ? color1 : color2;
				
				if (board[i][j] != '?' && board[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
