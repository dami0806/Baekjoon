import java.util.*;
import java.io.*;

class Main {
	static int[][] board;
	static int N, M;
	static ArrayList<Integer> arr;
	static boolean[][] visited;
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String args[]) throws Exception {
		// 5 150
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean found = false;

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		board = new int[N][M];
		visited = new boolean[N][M];

		// 0은 갈 수 없는 땅이고 1은 갈 수 있는 땅, 2는 목표지점이다. 입력에서 2는 단 한개

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		outer:
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 2) {
					board[i][j] = 0;
					bfs(i, j);
					break outer;
				}
			}

		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j] && board[i][j] == 1) {
					board[i][j] = -1;
				}
			}
		}
		showboard();

	}

	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int cur[] = queue.poll();

			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M)
					continue;
				if (board[nx][ny] == 1 && !visited[nx][ny]) {
					board[nx][ny] = board[cur[0]][cur[1]] + 1;
					visited[nx][ny] = true;
					queue.offer(new int[] { nx, ny });
				}
			}

		}
	}

	static void showboard() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}