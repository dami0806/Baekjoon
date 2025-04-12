
import java.util.*;
import java.io.*;

class Solution
{
    static int answer;
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int arr[][] = new int[N][N];
             answer = 0;
            
            for(int i = 0 ; i <N; i++) {
                String line = br.readLine(); 
            	 for(int j = 0 ; j <N; j++) {
                 	arr[i][j] = line.charAt(j) - '0' ;
                 }
            }      
           getdia(arr,N);
			System.out.println("#" +test_case+ " "+ answer );
		}
	}
    static void getdia(int[][] arr, int N) {
        for(int i = 0 ;i<N;i++) {
         	 int start = Math.abs(N/2-i);
             int end = N-start;
            for(int j = start; j<end; j++){
                answer +=arr[i][j];
            }
        }
    }
}