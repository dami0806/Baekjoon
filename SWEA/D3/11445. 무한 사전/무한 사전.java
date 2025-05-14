import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			String a = br.readLine();
			String b = br.readLine();
			String answer = "Y";
			StringBuilder sb= new StringBuilder();
			sb.append(a).append("a");
			if(sb.toString().equals(b)) {
				answer = "N";
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}