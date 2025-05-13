import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) {

			st = new StringTokenizer(br.readLine());
			
			int arr[] = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int count = 0;
			for (int i = 2; i >= 1; i--) {
				while (arr[i] <= arr[i - 1]) {
					arr[i - 1]--;
					count++;
					if (arr[i - 1] <= 0) {
						count = -1;
						break;
					}
				}
			}

			System.out.println("#" + test_case + " " + count);

		}
	}
}