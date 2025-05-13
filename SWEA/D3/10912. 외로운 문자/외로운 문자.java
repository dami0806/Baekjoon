import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			// qnwerrewmq
			String answer = "Good";
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();

			ArrayList<Character> list = new ArrayList<>();
			HashMap<Character, Integer> map = new HashMap<>();
			for (char c : s.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}

			for (Map.Entry entry : map.entrySet()) {
				int value = (int) entry.getValue();
				if (value % 2 != 0) {
					list.add((Character) entry.getKey());

				}
			}
			if (!list.isEmpty()) {
				Collections.sort(list);
				for (Character c : list) {
					sb.append(c);
				}
				answer = sb.toString();
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}