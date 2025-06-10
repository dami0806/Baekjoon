import java.util.*;
import java.io.*;

class Main {
	static int[][] board;
	static int M, N, K;
	static ArrayList<Integer>nerbis;
	static int nerbi;
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String args[]) throws Exception {
		// 5 150
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		nerbis = new ArrayList<>();
		board = new int[M + 1][N + 1];
		for (int i = 0; i < K; i++) {
			// 0 2 4 4
			st = new StringTokenizer(br.readLine());
			int startx = Integer.parseInt(st.nextToken());
			int starty = Integer.parseInt(st.nextToken());
			int endx = Integer.parseInt(st.nextToken());
			int endy = Integer.parseInt(st.nextToken());

			for (int x = startx; x < endx; x++) {
				for (int y = starty; y < endy; y++) {
					board[y][x] = 1;
				}
			}
		}
		for (int i = M - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 0) {
					nerbi = 1;
					bfs(i, j);
				}
			}
		}
		Collections.sort(nerbis);
		StringBuilder sb = new StringBuilder();
		for(int i : nerbis) {
			sb.append(i).append(" ");
		}
		System.out.println(nerbis.size());
		System.out.println(sb.toString());
	}

	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		board[x][y] = 1;
		
		while (!queue.isEmpty()) {
			int n[] = queue.poll();
			int cx = n[0];
			int cy = n[1];
			for (int k = 0; k < 4; k++) {
				int nx = cx + dx[k];
				int ny = cy + dy[k];

				if (nx < 0 || ny < 0 || nx >= M || ny >= N)
					continue;
				if (board[nx][ny] == 0) {
					nerbi++;
					board[nx][ny] = 1;
					queue.offer(new int[] { nx, ny });
				}
			}
		}
		nerbis.add(nerbi);
	}

	// 1. 직사각형있는 부분들을 모두 1로 바꾼다.
	// 2. 0인 부분을 찾아서 공간의 넓이를 구한다.
	static void showboard() {
		for (int i = M - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
