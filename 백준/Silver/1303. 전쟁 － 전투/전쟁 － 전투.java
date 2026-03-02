import java.util.*;
import java.io.*;

/**
 * 

1 2
BB


 */
public class Main{
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int N,M;
	static HashMap<String, Integer> map =new HashMap<>();
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 가로 길
		N = Integer.parseInt(st.nextToken());
		
		board = new char[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		map.put("W",0);
		map.put("B",0);
		
		for(int i = 0;i<N;i++) {
			String str= br.readLine();
			for(int j = 0;j<M;j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j = 0;j<M;j++) {
//				System.out.print(board[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < M;j++) {
				
				// 우리팀
				if(!visited[i][j]&& board[i][j] =='W') {
					bfs(i,j,'W');
				}
				// 적팀 
				if(!visited[i][j]&& board[i][j] =='B') {
					bfs(i,j,'B');
				}
			}
		}
		System.out.print(map.get("W") + " " + map.get("B"));
	} 
	
	static void bfs(int i, int j, char who) {
		Queue <int[]>queue = new ArrayDeque();
		int count = 1;
		queue.add(new int[] {i,j});
		visited[i][j] = true;
		
		while(!queue.isEmpty()) {
			int cur[ ] = queue.poll();
			
			for(int k=0; k<4; k++) {
				int nx = cur[0]+dx[k];
				int ny = cur[1]+dy[k];
				
				if(nx>=0 && ny>=0 && nx< N && ny< M) {
					if(!visited[nx][ny] && board[nx][ny] == who) {
						
						queue.add(new int[] {nx,ny});
						visited[nx][ny] = true;
						count++;
						

					}
				}
			}
		}
		map.put(String.valueOf(who),map.get(String.valueOf(who))+ count * count);
		
	}
}
	