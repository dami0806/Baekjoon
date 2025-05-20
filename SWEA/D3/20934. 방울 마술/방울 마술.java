import java.util.*;
import java.io.*;

public class Solution {
	static int[] score;
	static int count;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			// .o. 1
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			int initidx = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == 'o') {
					initidx = i;
					continue;
				}
			}
			count = Integer.parseInt(st.nextToken());
			score = new int[3];

			if (count == 0) {
				System.out.println("#" + test_case + " " + initidx);
				continue;
			}
			visited = new boolean[3][count + 1];
			start(initidx, 0);

			int max = Math.max(score[0], Math.max(score[1], score[2]));
			int answer = 0;
			for (int i = 0; i < 3; i++) {
				if (score[i] == max) {
					answer = i;
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + answer);

		}
	}

	static void start(int idx, int c) {
		
		if (visited[idx][c]) return;
	    visited[idx][c] = true;
	    
		// 방문 체크 어떻게?
		if (c == count) {
			score[idx]++;
			return;
		}
		if (idx == 0) {
			start(1, c + 1);

		} else if (idx == 1) {
			start(0, c + 1);
			start(2, c + 1);

		} else if (idx == 2) {
			start(1, c + 1);
		}
	}
}