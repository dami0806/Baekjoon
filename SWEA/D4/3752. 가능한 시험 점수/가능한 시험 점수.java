import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int arr[] = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			
			HashSet<Integer> set = new HashSet<>();
			set.add(0);
			
			for(int i = 0 ; i<N; i++) {
				HashSet<Integer> temp = new HashSet<>(set);
				for(int j : temp) {
					int n = j+arr[i];
					set.add(n);
				}
			}
			
			System.out.println("#"+ test_case+ " " + set.size());
		}
	}
}
