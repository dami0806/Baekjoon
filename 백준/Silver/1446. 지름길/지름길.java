import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		// 5 150
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());

		ArrayList<int[]> road = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			if (end > goal || time >= end - start)
				continue;

			road.add(new int[] { start, end, time });
		}
		int dp[] = new int[goal + 1];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for (int i = 0; i <= goal; i++) {
			if(i>0 && dp[i] > dp[i - 1] + 1) {
				dp[i] = dp[i - 1] + 1;
			}
			for(int[] s: road) {
				int start = s[0];
				int end = s[1];
				int time = s[2];
				
				if(start == i) {
					dp[end] = Math.min(dp[end],dp[i]+ time);
				}
			}			
		}

		System.out.println(dp[goal]);
	}}
