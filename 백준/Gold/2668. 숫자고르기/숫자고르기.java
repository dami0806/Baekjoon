import java.util.*;
import java.io.*;

/**
 * 
 
7
3
1
1
5
5
4
6

3
1
3
5

 */
public class Main{
	static ArrayList<Integer> answer = new ArrayList<>();
	static boolean[]visited;
	static boolean[]finished;
	static int[] next;
	
	public static void main(String args[])throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		next= new int[N+1];
		visited = new boolean[N+1];
		finished = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			next[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		
		Collections.sort(answer);
		
		for(int a: answer) {
			sb.append(a).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void dfs(int now){
		visited[now] = true;
		
		int nextNode = next[now]; 
		
		if(!visited[nextNode]) {
			dfs(nextNode);
		}
		else if(!finished[nextNode]) {
			// 사이클 발견 
			int temp = nextNode;
			answer.add(nextNode);
			
			// now 부터 지금꺼까지 answer에 넣기
			while(now != temp) {
				temp = next[temp];
				answer.add(temp);
			}
		}
		finished[now] = true;
	}
}
	