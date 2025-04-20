
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
    
		for(int test_case = 1; test_case <= T; test_case++) {
              int arr[] = new int[10];
            int answer =0;
             StringTokenizer st = new StringTokenizer(br.readLine());
            
             for(int i =0;i< 10;i++){
                 arr[i] = Integer.parseInt(st.nextToken());
             }
            Arrays.sort(arr);
              for(int i =1;i< 9;i++){
               	answer+=arr[i];
              }
            answer =(int)Math.round(answer/8.0);
            System.out.println("#" + test_case+ " "+ answer);
		}
	}
}