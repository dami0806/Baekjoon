import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int board[][] = new int[N][M];
			int max = 0;
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int sum[] = new int[N];
			// 가장큰 [i]합
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					sum[i] += board[i][j];
				}
			}
			int count = 0;
			// 가장큰 j사람이 가진 문제수
			for (int i = 0; i < N; i++) {
				if(max<sum[i]) {
					count = 1;
					max = sum[i];
					
				}else if(max == sum[i]) {
					count++;
				}
			}

			sb.append(count).append(" ");
			sb.append(max);
			System.out.println("#" + test_case + " " +sb.toString());
		}
		
	}
}