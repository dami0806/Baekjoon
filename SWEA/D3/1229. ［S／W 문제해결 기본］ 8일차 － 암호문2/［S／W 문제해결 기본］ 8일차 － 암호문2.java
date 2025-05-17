import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 193

			ArrayList<Long> origin = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			// 701633 517247 207227 598906
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				origin.add(Long.parseLong(st.nextToken()));
			}

			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); // 193

			st = new StringTokenizer(br.readLine().trim());
			int idx = 0;
			int count = 0;


			//while (M > 0) {
			while(st.hasMoreTokens()) {
				String str= st.nextToken().toString();
				if (str.equals("I")) {
					// I 19 4 281822 746265 450734 108373
					idx = Integer.parseInt(st.nextToken()); // 19
					count = Integer.parseInt(st.nextToken()); // 4

					for (int i = 0; i < count; i++) {
						origin.add(idx++, Long.parseLong(st.nextToken()));
					}
				}

				if (str.equals("D")) {
					idx = Integer.parseInt(st.nextToken()); // 19
					count = Integer.parseInt(st.nextToken()); // 4
					while (count-- > 0) {
						origin.remove(idx);
					}

				}
			}

			for (int i = 0; i < 10; i++) {
				sb.append(origin.get(i)).append(" ");
			}
			System.out.println("#" + test_case + " "+ sb);
		}
	}
}