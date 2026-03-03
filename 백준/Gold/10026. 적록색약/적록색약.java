import java.util.*;
import java.io.*;

/**
 * 
 
5
RRRBB
GGBBB
BBBRR
BBRRR
RRRRR

4 3

 */
public class Main{
	static char [][]board;
	static boolean[][] visited;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int N;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		board = new char[N+1][N+1];
		visited = new boolean[N+1][N+1];
		int count =0;
		for(int i = 0 ;i<N;i++) {
			String str = br.readLine();
			
			for(int j = 0 ;j<N;j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0 ;i < N;i++) {
			for(int j = 0 ;j<N;j++) {
				if(!visited[i][j]) {
					bfs(i,j,board[i][j]);
					count++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(count).append(" ");
		// 새로 시작 
		
		visited = new boolean[N+1][N+1];
		count = 0;
		
		for(int i = 0 ;i<N;i++) {			
			for(int j = 0 ;j<N;j++) {
				if(board[i][j] == 'G') {
					board[i][j] = 'R';
				}
			}
		}
		
		for(int i = 0 ;i < N;i++) {
			for(int j = 0 ;j<N;j++) {
				if(!visited[i][j]) {
					bfs(i,j,board[i][j]);
					count++;
				}
			}
		}
		sb.append(count);
		System.out.println(sb.toString());
	}
	
	static void bfs(int i, int j, char word) {
		Queue<int[]>queue = new ArrayDeque();
		queue.add(new int[] {i,j});
		visited[i][j] = true;
		
		while(!queue.isEmpty()) {
			int cur[] = queue.poll();
			for(int k = 0 ;k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];
				
				if(nx>=0 && ny>=0 && nx<N && ny<N) {
					if(!visited[nx][ny] && board[nx][ny]==word) {
						queue.add(new int[] {nx,ny});
						visited[nx][ny] = true;
					}
				}
			}
		}		
	}
}
	