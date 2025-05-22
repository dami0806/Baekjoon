import java.util.*;
import java.io.*;

public class Solution {
	static int[][] board;
	static int answer;
	static int[]dx = {0,1,0,-1};
	static int[]dy = {1,0,-1,0};
	static boolean [][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int test_case = 1; test_case <= 10; test_case++) {
			board = new int[101][101];
			visited = new boolean[101][101];
			br.readLine(); // 1
			answer = 0;

			int start = 0;
			int startx = 0;
			int starty = 0;

			for (int i = 0; i < 100; i++) {
				String s = br.readLine();
				for (int j = 0; j < 100; j++) {
					start = s.charAt(j)-'0';
					board[i][j] = start;
					if (start == 2) {
						startx = i;
						starty = j;
					}
				}
			} // 2,3 찾기

			bfs(startx, starty);

			System.out.println("#" + test_case + " " + answer);

		}
	}

	static void bfs(int startx, int starty) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { startx, starty });
		visited[startx][starty] = true;
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			
			
			for(int k = 0 ; k <4; k ++) {
				int nx = now[0]+dx[k];
				int ny = now[1]+dy[k];
				
				if(nx<0 ||ny <0 || ny >=100 || nx>=100) continue;
				
				if(board[nx][ny] == 3) {
					answer = 1;
					return;
				}
				
				if(board[nx][ny] ==0 && !visited[nx][ny]) {
					queue.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
				}
			}
		}
	}
}