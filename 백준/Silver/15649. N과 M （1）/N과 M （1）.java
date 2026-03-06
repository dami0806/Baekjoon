import java.util.*;
import java.io.*;

/**
 * 

14502다시 풀기 
15650번

4 2
4 4


 */
public class Main{

	static int N, M;
	static int[]arr;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visited = new boolean[N+1];
		dfs(0);
		System.out.println(sb.toString());
	}
	
	
	static void dfs(int count) {
		if(count == M) {
			for(int i = 0 ; i < M ;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		//도달 안했다면 
		for(int i = 0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[count] = i+1;
				dfs(count+1);
				visited[i] = false;
			}
		}
	}
}
	