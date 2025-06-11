import java.util.*;
import java.io.*;

class Main {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int maxNum = Integer.parseInt(st.nextToken());
		
		int[] K = new int[n]; // 필요한 공부시간
        int[] S = new int[n]; // 점수
		
		for(int i = 0 ; i< n ; i ++) {
			st = new StringTokenizer(br.readLine());
			K[i] = Integer.parseInt(st.nextToken());
			S[i] = Integer.parseInt(st.nextToken());
		}
		
		//가장 큰 dp[] 값 = dp[]+
		int dp[] = new int[maxNum+1];
		for(int i = 0 ; i< n ; i ++) {
			for(int j = maxNum; j >= K[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - K[i]] + S[i]);
			}
		}		
		System.out.println(dp[maxNum]);
	}
}