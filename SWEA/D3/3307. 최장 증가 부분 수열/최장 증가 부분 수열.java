
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int T = Integer.parseInt(st.nextToken());
        
		for(int test_case = 1; test_case <= T; test_case++)	{

           
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            int dp[] = new int[N];
            
            st = new StringTokenizer(br.readLine().trim());
            for(int i = 0 ; i<N; i++) {
                arr[i] =  Integer.parseInt(st.nextToken());
            }
            int max = 1;
          
            for(int i = N-1 ; i>=0; i--) {
                 dp[i] = 1;
            	 for(int j = i+1 ; j<N;j++) {
                 if(arr[i] < arr[j]) {
                     dp[i] = Math.max(dp[j] + 1, dp[i]);
                 	}
                }
                max = Math.max(dp[i], max);
            }
            
    		System.out.println("#"+ test_case+" " +max);
		}
	}
}