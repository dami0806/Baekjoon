
import java.util.*;
import java.io.*;

public class Solution {
	static int board[][];
	static int N;
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			board = new int[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()); // 1 2

				for (int j = 0; j < N; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int result[] = new int[N * N + 1];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					result[board[i][j]] = bfs(i, j); // result[3] = bfs(0,1)
				}
			}

			// result[i] 중에서 최대 를 구하기
			// 만약 최대가 여러개라면 i가가장 작은것을 구하

			int max = 0;
			int x = 1;
			for (int i = 1; i <= N * N; i++) {
				if (result[i] > max) {
					max = result[i];
					x = i;
				}
			
			}
			System.out.println("#" + test_case + " " + x + " " + max);
		}
	}

	static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		int count = 0;

		queue.offer(new int[] { i, j });

		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			count++;

			for (int k = 0; k < 4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N && board[now[0]][now[1]] + 1 == board[nx][ny]) {
					queue.offer(new int[] { nx, ny });
				}
			}
		}

		return count;

	}
}
