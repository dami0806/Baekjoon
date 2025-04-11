import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int arr[][] = new int[100][100];
            int answer = 0;
            int N = Integer.parseInt(br.readLine());
            
            
           
            for(int i = 0 ;i<100; i++) {
                 StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j <100; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
             int sero[] = new int[100];
             int garo[] = new int[100];
             int right = 0;
             int left = 0;
              int maxgaro = 0;
             int maxsero =0;
            
            for(int i = 0 ; i< 100; i++) {
            	for(int j = 0 ; j <100; j++) {
                    garo[i]+=arr[i][j];
                    sero[i]+=arr[j][i];
                    if( i ==j ) {right += arr[i][j]; } // 0 0 1 1 2 2 3 3  99
                    if( i == 99-j ) { left +=arr[i][j]; } 
                        // 0 99 1 98 .. 99 0
                }
            }
         
            for(int i = 0 ; i< 100; i++) {
              maxgaro =  Math.max(garo[i],maxgaro);
              maxsero =  Math.max(sero[i],maxsero); 
            }
            answer = Math.max( Math.max(maxgaro,maxsero), Math.max(left,right));
            System.out.println("#" +test_case + " " +answer);
		}
	}
}