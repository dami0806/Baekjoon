import java.util.*;
import java.io.*;

public class Solution {
	static char[][] board;
	static String answer = "possible";
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		String a = "abcdefghijklmnopqrstuvwxyz"; 


		for (int test_case = 1; test_case <= T; test_case++) {
			String b = br.readLine();
			int i = 0;
			int count = 0;
			
			for (char c : a.toCharArray()) {
				if(i>=b.length()) break;
				if (c == b.charAt(i)) {
					count++;
                    i++;
				}else {
                	break;}
				
			}
			System.out.println("#" + test_case + " " +count);
		}
	}

}
