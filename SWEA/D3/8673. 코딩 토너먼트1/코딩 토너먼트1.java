import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {

			// 31 46 13 29 27 45 10 57
			int game = Integer.parseInt(br.readLine().trim());
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < Math.pow(2, game); i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			int count = 0;

			while (list.size()>1) {

				for (int i = 0; i < list.size() - 1; i++) {
					if (list.get(i) > list.get(i + 1)) {
						count = count + (list.get(i) - list.get(i + 1));
						list.remove(i + 1);
					} else {
						count = count + (list.get(i + 1) - list.get(i));
						list.remove(i);
					}
				}
			}
			System.out.println("#" + test_case + " " +count );
		}
	}
}