import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			long arr[] = new long[N];
			long arrsort[] = new long[N - 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			// 4 3
			// 1 2 3 4
			// 1 1 1 
			//0부터 1까지, 1 부터 2까지 2,2

			Arrays.sort(arr);

			for (int i = 0; i < N - 1; i++) {
				arrsort[i] = arr[i + 1] - arr[i];
			}
			long answer = 0;
			long min = 1000000001;
            
			for (int i = 0; i <= N-M ; i++) {
                answer = 0;
				for (int j = 0; j <= M - 2; j++) {
					answer += arrsort[i + j];
				}min = Math.min(answer, min);
			}

			System.out.println("#" + test_case + " " + min);

		}
	}
}