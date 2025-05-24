import java.util.*;
import java.io.*;

public class Main {
	static int[][] board;
	static int n;
	static int m;
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		// 10 15
		// 5 1 3 5 10 7 4 9 2 8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine().trim();
			for (int j = 0; j < m; j++) {
				board[i][j] = (s.charAt(j) - '0');
			}
		}

		//showboard();
		bfs(0,0);
		System.out.println(board[n-1][m-1]);
		// 최단거리 찾

	}

	static void bfs(int start, int end) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { start, end });

		if (start == n && end == m) {
			return;
		}
		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			
			for (int k = 0; k < 4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m ||board[nx][ny] == 0) 
					continue;
				if (board[nx][ny] == 1) {
					queue.offer(new int[] { nx, ny });
					board[nx][ny] = board[now[0]][now[1]] +1;
					
				}
			}

		}

	}

	static void showboard() {

		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(board[i][j] + " ");
			}
		}
	}
}