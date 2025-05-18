import java.util.*;

import java.io.*;

public class Solution {

	static int N;
	static String[] strArr;
	static int max;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			HashSet<Character> set = new HashSet<>();
			// 0123456789
			String str= br.readLine().trim();
			
			for(char c: str.toCharArray()) {
				if(set.contains(c)) {
					set.remove(c);
				}else {
					set.add(c);
				}
			}
			System.out.println("#" + test_case + " "+ set.size());
		}
	}
}