import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	StringTokenizer st = new StringTokenizer(br.readLine());
		//int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= 10; test_case++) {

			int oriN = Integer.parseInt(br.readLine().trim());
			ArrayList<Integer> oriList = new ArrayList<>();

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < oriN; i++) {
				oriList.add(Integer.parseInt(st.nextToken()));
			}

			int changeN = Integer.parseInt(br.readLine().trim());

			// A 1 989955 D 1100 5
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				String word = st.nextToken().toString();
				if (word.equals("I")) {
					int x = Integer.parseInt(st.nextToken());// 4
					int y = Integer.parseInt(st.nextToken());

					// x다음 바로 y개
					for (int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						oriList.add(x++, s);
					}

				} else if (word.equals("D")) {
					int x = Integer.parseInt(st.nextToken());// x번째에 
					int y = Integer.parseInt(st.nextToken()); // y개를 

					for (int i = 0; i < y; i++) {
						oriList.remove(x);
					}

				} else if (word.equals("A")) {
					int y = Integer.parseInt(st.nextToken());

					for (int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						oriList.add(s);
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			int len = oriList.size();
			for (int i = 0; i < 10; i++) {
				sb.append(oriList.get(i)).append(" ");
			}
			System.out.println("#" + test_case + " " + sb.toString());
		}
	}

}