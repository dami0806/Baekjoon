import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			long A = Long.parseLong(st.nextToken()); // 5사람들
			long B = Long.parseLong(st.nextToken());
			
			long answer = -1;
			long k = B - A;

			if (k < 2) {
				answer = -1;
                if(k==0) {
                answer =0;
            }
			} 
            else {
				if (k % 2 == 0) {
					answer = k / 2;
				} else {
					answer = (k - 3) / 2 + 1;
				}
			}
			System.out.println("#"+ test_case + " " + answer);
		}
	}
}