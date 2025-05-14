import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			long N = Long.parseLong(br.readLine().trim());
			long sum = (N/2)*(N/2);
			System.out.println("#" + test_case + " " + sum);
		}
	}
}