import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			// congratulation -> ‘a’, ‘e’, ‘i’, ‘o’, ‘u 제거하
			char[] chars = st.nextToken().toCharArray();
			StringBuilder sb = new StringBuilder();
			
			for(char c : chars) {
				if(c == 'a'||c == 'e'||c =='i'||c =='o' ||c =='u') {
					continue;
				}
				sb.append(c);
				
			}


			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}