import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			int time = n*2;
			int hour = time/60;
			int min = time%60;
			
			StringBuilder sb = new StringBuilder();
			sb.append(hour).append(" ").append(min);
			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}