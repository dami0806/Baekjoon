import java.util.*;
import java.io.*;

public class Solution {
	static int[] score;
	static int count;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine().trim());
			HashSet<Integer> set = new HashSet<>();
			for (int j = 0; j < 10; j++) {
				set.add(j);
			}

			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");

				String s = str[4];
				List<Integer> nums = new ArrayList<>();
				
				for (int j = 0; j < 4; j++) {
					nums.add(Integer.parseInt(str[j]));
				}

				if (s.equals("YES")) {
					set.retainAll(nums);

				}
				if (s.equals("NO")) {
					for (int j = 0; j < 4; j++) {
						if (set.contains(Integer.parseInt(str[j]))) {
							set.remove(Integer.parseInt(str[j]));
						}
					}
				}
			}
			int answer = set.iterator().next();

			System.out.println("#" + test_case + " " + answer);
		}
	}
}