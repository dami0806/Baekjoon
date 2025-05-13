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
			String[] str = new String[N];
			for (int i = 0; i < N; i++) {
				str[i] = br.readLine();
			}
			ArrayList<Character> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(str[i].charAt(0));
			}
			Collections.sort(list);
			int count = 0;
			if (list.get(0) == 'A') {
				count++;
				int cur = 65;
				for (int i = 1; i < N; i++) {
					if(list.get(i) == cur+1) {
						cur = cur+1;
						count++;
					}
				}
			}System.out.println("#" + test_case + " " +count);
		}
	}
}