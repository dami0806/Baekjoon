
import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 2

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine()); // 3
			int N = Integer.parseInt(st.nextToken());
			int arr [][] = new int[N][2];
			
			for(int i = 0 ; i<N ;i++) {
				st = new StringTokenizer(br.readLine()); // 1 10
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr,(a,b) -> a[0]-b[0]);
			int count = 0;
			
			// 1 5 7  -> 10 5 7
			for(int i = 0 ; i<N-1; i++) {
				for(int j = i+1; j<N; j++) {
					if(arr[i][1] > arr[j][1]) count++;
				}
			}
			System.out.println("#" + test_case + " "+ count);
			
		}
	}
}