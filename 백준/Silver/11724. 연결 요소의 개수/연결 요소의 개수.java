import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer> list[];
	static boolean visited[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		list = new ArrayList[n+1];
		visited = new boolean[n+1];
		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				bfs(i);
				answer++;
			}
		}
		System.out.println(answer);

	}

	static void bfs(int depth) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(depth);
		visited[depth] = true;
		
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (int i : list[now]) {
				if (!visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}

	}
}
