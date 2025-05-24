import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// 10 15
		// 5 1 3 5 10 7 4 9 2 8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0;
		long min = n + 1;
		int start = 0;
		int end = 0;
		long answer = 0;
		// 연속 수로 합을 구하는데 최소인 수
		while (true) {
			if (sum >= target) {
				min = Math.min(min, end - start);
				answer++;
				sum -= arr[start++];
				
			} else if (sum < target) {
				if (end == n) {
					break;
				}
				sum += arr[end++];

			} 
		}
		System.out.println(answer == 0 ? 0 : min);

	}
}