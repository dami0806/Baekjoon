import java.util.*;
import java.io.*;

public class Solution {
	static ArrayList<Integer> A[];
	static boolean visited[];
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 3
			String s = br.readLine();
			
			// (), |), (|갯수 세기
			int count = 0;
			// .|.(|...||)|...()..
			char[] chars = s.toCharArray();
			for(int i = 0 ; i < chars.length-1; i++) {
				if((chars[i] == '(' && (chars[i+1] == ')' ||chars[i+1] == '|' ) )||
					(chars[i] == '|' && (chars[i+1] == ')'))) {
					count++;
				}
			}
			
			
			System.out.println("#" + test_case + " "+ count);
			
		}
	}
}