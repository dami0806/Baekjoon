
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		int T = Integer.parseInt(st.nextToken());
		
        for(int test_case = 1; test_case <= T; test_case++) {
		    st = new StringTokenizer(br.readLine()); // 5
            int n = Integer.parseInt(st.nextToken());

            int arr[] = new int[n];
			int answer = 0;
            int up = 0;
            int down = 0;
            int maxup = 0;
            int maxdown = 0;
           
            st = new StringTokenizer(br.readLine()); // 5
            
            for(int i = 0 ;i <n ; i++) {
                 arr[i] =Integer.parseInt(st.nextToken());
            }
            
                for (int i = 0 ; i<n-1 ; i++) {
                	 answer = arr[i] - arr[i+1]; 
                    
                    if(answer <0) { // 올라가는거
                        up = Math.abs(answer);
                        maxup = Math.max(up,maxup);
                    }
                    else {
                        down = Math.abs(answer);
                        maxdown = Math.max(down,maxdown);
                    }
                }
            
            System.out.println("#"+ test_case+ " " + maxup + " "+maxdown);
            
		}
	}
}