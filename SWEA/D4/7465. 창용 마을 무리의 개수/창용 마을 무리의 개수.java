import java.util.*;
import java.io.*;

public class Solution {
	static ArrayList<Integer> A[];
	static boolean visited[];
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 2
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			A = new ArrayList[N + 1];
            visited = new boolean[N+1];

			int count = 0;
			for (int i = 1; i <= N; i++) {
				A[i] = new ArrayList<>();
			}
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				A[s].add(e);
				A[e].add(s);
			}
			
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					dfs(i);
					count++;
				}
			}
			System.out.println("#" + test_case +" " +count);
		}
	}
    
	static void dfs(int i) {
		visited[i] = true;
		
		for(int n: A[i]) {
			if(!visited[n]) {
				dfs(n);
			}
		}
	}
}