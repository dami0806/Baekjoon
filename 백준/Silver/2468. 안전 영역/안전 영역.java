import java.util.*;
import java.io.*;

/**
 * 

5
6 8 2 6 2
3 2 3 4 6
6 7 3 3 2
7 2 5 3 6
8 9 5 2 7

 */
public class Main{
	static boolean visited[][];
	static int board[][];
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int N;

	static public void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int MaxWater = 0;
		int MaxCount = 0;

		board = new int[N+1][N+1];
		
		for(int i= 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j= 0 ; j < N ; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				MaxWater = Math.max(MaxWater, board[i][j]);
			}
		}
		// 1부터 최대수-1까지 
		for(int water = 0; water< MaxWater; water++) {
			
			// 물이 water만큼 찼을때
			visited = new boolean[N+1][N+1];
			int count = 0;
			
			for(int i= 0 ; i < N ; i++) {
				for(int j= 0 ; j < N ; j++) {
					if(!visited[i][j] && board[i][j]-water > 0) {
						bfs(i,j,water);
						count++;
					}
				}
			}	
			MaxCount = Math.max(MaxCount, count);
		}
		System.out.println(MaxCount);
		
//		for(int i= 0 ; i < N ; i++) {			
//			for(int j= 0 ; j < N ; j++) {
//				System.out.print(board[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
	static void bfs(int i, int j, int water) {
		// 방문 안하고, 범위 내에 있고,  board[i][j]-water > 0이거면쭉 돌기 
		visited[i][j] = true;
		Queue<int[]> queue = new ArrayDeque();
		queue.add(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			int cur[] = queue.poll();
			for(int k = 0 ; k< 4 ; k++) {
				int nx = cur[0]+dx[k];
				int ny = cur[1]+dy[k];
				
				if(nx >=0 && ny >= 0 && nx <N && ny<N) {
					if (!visited[nx][ny] && board[nx][ny]-water>0) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
	