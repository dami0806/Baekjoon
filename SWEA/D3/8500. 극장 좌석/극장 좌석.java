import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int sum = arr[N-1];
			
			for(int i = 0; i<N; i++) {
				sum+=arr[i];
			}
			sum += N;
			
			System.out.println("#" + test_case+ " " + sum);
		}
	}
}